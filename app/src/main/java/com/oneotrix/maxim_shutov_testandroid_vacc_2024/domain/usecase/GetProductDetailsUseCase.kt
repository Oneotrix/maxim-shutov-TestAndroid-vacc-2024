package com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.usecase

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.repository.ProductsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetProductDetailsUseCase @Inject constructor(
    private val repository: ProductsRepository
) {

    suspend operator fun invoke(id: String) = withContext(Dispatchers.IO) {
        return@withContext repository.getProductDetail(id)
    }

}