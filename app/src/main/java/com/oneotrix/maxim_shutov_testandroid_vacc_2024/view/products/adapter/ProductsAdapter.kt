package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.databinding.ItemProductsBinding
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.utils.Comparator
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products.MealModel

class ProductsAdapter: ListAdapter<MealModel, ProductViewHolder>(
    Comparator.productsDiffCallback
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        Log.d("ProductsAdapter", "createVh")
        return ProductViewHolder(
            binding = ItemProductsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(getItem(position))
        Log.d("ProductsAdapter", "${getItem(position)}")

    }
}