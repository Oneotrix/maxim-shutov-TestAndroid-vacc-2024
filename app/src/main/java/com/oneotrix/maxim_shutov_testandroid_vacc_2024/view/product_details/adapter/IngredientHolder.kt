package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.databinding.ItemIngredientsBinding

class IngredientHolder(
    private val binding: ItemIngredientsBinding
): ViewHolder(binding.root) {

    fun bind(model: IngredientModel) = with(binding) {
        tvIngredient.text = model.ingredient
        tvMeasure.text = model.measure
    }
}