package com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model

data class ProductDetailModel(
    val id: String,
    val title: String,
    val description:String,
    val imgUrl: String,
    val ingredientsAndMeasure: Map<String, String>
)