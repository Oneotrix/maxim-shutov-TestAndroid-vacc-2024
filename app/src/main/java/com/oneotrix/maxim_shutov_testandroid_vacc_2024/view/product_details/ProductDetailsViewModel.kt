package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details

import android.widget.ImageView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.App
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.usecase.GetProductDetailsUseCase
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details.adapter.IngredientModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ProductDetailsViewModel(
    private val getProductDetailsUseCase: GetProductDetailsUseCase,
    private val id: String
): ViewModel() {

    private val _data = MutableStateFlow(DetailsUiState.State())
    val data = _data.asStateFlow()


    init {
        fetchData(id)
    }

    private fun fetchData (id: String) = viewModelScope.launch {
        getProductDetailsUseCase(id).let { model ->
            val ingredients = model.ingredientsAndMeasure.map {
                IngredientModel(
                    ingredient = it.key,
                    measure = it.value
                )
            }

            _data.update {
                DetailsUiState.State(
                    title = model.title,
                    description = model.description,
                    imgUrl = model.imgUrl,
                    ingredientAndMeasure = ingredients
                )
            }
        }
    }

    fun loadImage(ivProduct: ImageView, url: String) = viewModelScope.launch{
        if (ivProduct.drawable == null && url.isNotBlank()) {
            App.picasso.load(url).into(ivProduct)
        }
    }

    sealed class DetailsUiState {
        data class State(
            val title: String = "",
            val description: String = "",
            val imgUrl: String = "",
            val ingredientAndMeasure: List<IngredientModel> = listOf()
        )
    }
}