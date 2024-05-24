package com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.usecase

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.repository.ProductsRepository
import javax.inject.Inject

class GetProductDetailsUseCase @Inject constructor(
    private val repository: ProductsRepository
) {



}