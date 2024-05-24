package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.usecase.GetProductsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ProductsViewModel(
    private val getProductsUseCase: GetProductsUseCase
): ViewModel() {

    private val _data = MutableStateFlow(UiState.State())
    val data: StateFlow<UiState.State> = _data.asStateFlow()

    init {
        fetchProducts()
    }

    private fun fetchProducts() = viewModelScope.launch {
        _data.update { state ->
            val meals = getProductsUseCase().map { product ->
                MealModel.map(product)
            }
            UiState.State(meals = meals)
        }
    }

    sealed class UiState {
        data class State(
            val meals: List<MealModel> = listOf()
        )

    }
}