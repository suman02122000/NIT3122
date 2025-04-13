package com.example.language.models

data class EntityDetails(
    val name: String,
    val family: String,
    val branch: String,
    val speakers: Long,
    val writingSystem: String,
    val officialIn: List<String>,
    val description: String
)
