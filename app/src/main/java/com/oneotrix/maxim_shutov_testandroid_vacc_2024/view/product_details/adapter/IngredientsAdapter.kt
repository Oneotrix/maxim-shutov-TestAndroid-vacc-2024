package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.databinding.ItemIngredientsBinding
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.utils.Comparator

class IngredientsAdapter: ListAdapter<IngredientModel, IngredientHolder>(
    Comparator.ingredientsDiffCallback
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientHolder {
        Log.d("IngredientsAdapter", "create Vh")
        return IngredientHolder(
            binding = ItemIngredientsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: IngredientHolder, position: Int) {
        holder.bind(getItem(position))
    }

}