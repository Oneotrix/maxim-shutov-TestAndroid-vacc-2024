package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductModel

data class MealModel(
    val id: String,
    val title: String,
    val description:String,
    val imgUrl: String,
) {

    companion object {
        fun map(product: ProductModel): MealModel {
            return MealModel(
                id = product.id,
                title = product.title,
                description = product.description,
                imgUrl = product.imgUrl
            )
        }
    }
}
