package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.usecase.GetProductsUseCase
import javax.inject.Inject

class ProductsViewModelFactory @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductsViewModel(
            getProductsUseCase = getProductsUseCase
        ) as T
    }
}