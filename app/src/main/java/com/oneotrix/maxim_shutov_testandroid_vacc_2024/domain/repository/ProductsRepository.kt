package com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.repository

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductDetailModel
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductModel


interface ProductsRepository {

    suspend fun getProducts(): List<ProductModel>

    suspend fun getProductDetail(id: String) : ProductDetailModel

}