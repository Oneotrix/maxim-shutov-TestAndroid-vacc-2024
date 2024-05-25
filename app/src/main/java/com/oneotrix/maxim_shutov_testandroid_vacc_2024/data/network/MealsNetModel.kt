package com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MealsNetModel(
    @SerialName("meals")
    var meals: List<MealNetModel> = listOf()
)
