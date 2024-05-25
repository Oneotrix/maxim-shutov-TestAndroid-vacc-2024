package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.usecase.GetProductDetailsUseCase
import javax.inject.Inject
import javax.inject.Named

class ProductDetailsViewModelFactory @Inject constructor(
    private val getProductDetailsUseCase: GetProductDetailsUseCase,
    @Named("id") private val id: String,
): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductDetailsViewModel(
            getProductDetailsUseCase,
            id
        ) as T
    }

}