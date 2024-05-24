package com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.usecase

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductModel
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.repository.ProductsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val repository: ProductsRepository
) {

    suspend operator fun invoke() : List<ProductModel> = withContext(Dispatchers.IO) {
        return@withContext repository.getProducts()
    }

}