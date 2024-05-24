package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.App
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.databinding.ItemProductsBinding
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products.MealModel

class ProductViewHolder(
    private val binding: ItemProductsBinding
): ViewHolder(binding.root) {

    private val picasso by lazy {
        App.picasso
    }

    fun bind(model: MealModel) = with(binding) {
        picasso.load(model.imgUrl).into(ivProduct)
        tvTitleMeal.text = model.title
        tvDescription.text = model.description
    }

}