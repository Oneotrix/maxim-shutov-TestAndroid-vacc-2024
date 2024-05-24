package com.oneotrix.maxim_shutov_testandroid_vacc_2024.utils

import androidx.recyclerview.widget.DiffUtil
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

}