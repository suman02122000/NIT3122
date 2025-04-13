package com.example.language.models

data class DashboardResponse(
    val entities: List<EntityDetails>,
    val entityTotal: Int
)
