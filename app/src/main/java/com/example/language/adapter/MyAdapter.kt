package com.example.language.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.language.activities.DetailActivity
import com.example.language.R
import com.example.language.models.EntityDetails

class MyAdapter(private val entityList: List<EntityDetails>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val entityName: TextView = itemView.findViewById(R.id.languageName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_entity_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val entity = entityList[position]

        holder.entityName.text = entity.name

        // Set onClickListener for navigating to the DetailActivity
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java).apply {
                putExtra("name", entity.name)
                putExtra("family", entity.family)
                putExtra("branch", entity.branch)
                putExtra("speakers", entity.speakers)
                putExtra("writingSystem", entity.writingSystem)
                putExtra("officialIn", entity.officialIn.joinToString(", "))  // Pass as a string
                putExtra("description", entity.description)
            }
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return entityList.size
    }
}
