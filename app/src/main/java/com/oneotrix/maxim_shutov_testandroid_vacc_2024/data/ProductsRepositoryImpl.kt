package com.oneotrix.maxim_shutov_testandroid_vacc_2024.data

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.network.MealNetModel
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductDetailModel
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductModel
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.repository.ProductsRepository

class ProductsRepositoryImpl(
    private val api: Api
): ProductsRepository {
    override suspend fun getProducts(): List<ProductModel> {
        return api.getMealsList().meals
            .map { MealNetModel.map(it) }
    }

    override suspend fun getProductDetail(id: String): ProductDetailModel {
        val netModel = api.getMeal(id).meals[0]

        return MealNetModel.mapToDetailModel(
            netModel
        )
    }
}