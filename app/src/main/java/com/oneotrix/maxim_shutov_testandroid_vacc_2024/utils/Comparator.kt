package com.oneotrix.maxim_shutov_testandroid_vacc_2024.utils

import androidx.recyclerview.widget.DiffUtil
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details.adapter.IngredientModel
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products.MealModel

object Comparator {

    val productsDiffCallback = object : DiffUtil.ItemCallback<MealModel>(){
        override fun areItemsTheSame(oldItem: MealModel, newItem: MealModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MealModel, newItem: MealModel): Boolean {
            return oldItem == newItem
        }

    }

    val ingredientsDiffCallback = object : DiffUtil.ItemCallback<IngredientModel>(){
        override fun areItemsTheSame(oldItem: IngredientModel, newItem: IngredientModel): Boolean {
            return oldItem.ingredient == newItem.ingredient
        }

        override fun areContentsTheSame(
            oldItem: IngredientModel,
            newItem: IngredientModel
        ): Boolean {
            return oldItem == newItem
        }

    }

}