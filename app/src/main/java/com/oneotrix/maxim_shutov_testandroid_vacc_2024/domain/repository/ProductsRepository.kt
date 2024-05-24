package com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.repository

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductModel
import kotlinx.coroutines.flow.Flow


interface ProductsRepository {

    suspend fun getProducts(): List<ProductModel>

}