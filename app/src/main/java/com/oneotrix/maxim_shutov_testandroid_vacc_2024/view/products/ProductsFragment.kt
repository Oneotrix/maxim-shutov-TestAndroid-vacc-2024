package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products

import android.os.Bundle
import android.util.Log
import android.view.View
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.databinding.FragmentProductsBinding
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.BaseFragment

class ProductsFragment: BaseFragment<FragmentProductsBinding>(
    FragmentProductsBinding::inflate
) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ProductsFragment", "onViewCreated + ${binding.tvTitleProducts.text}")
    }


    companion object {
        fun newInstance() = ProductsFragment
    }
}