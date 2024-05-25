package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.App
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.databinding.FragmentProductDetailsBinding
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.BaseFragment
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details.adapter.IngredientsAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class ProductDetailsFragment: BaseFragment<FragmentProductDetailsBinding>(
    FragmentProductDetailsBinding::inflate
) {

    @Inject
    lateinit var viewModelFactory: ProductsDetailsFactory

    private val viewModel: ProductDetailsViewModel by viewModels { viewModelFactory }

    private val id: String by lazy {
        requireArguments().getString("id", "")
    }

    private val adapter by lazy {
        IngredientsAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        App.productsComponent.productDetailsFragmentComponentBuilder()
            .id(id)
            .build()
            .inject(this@ProductDetailsFragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        observeData()
    }

    private fun initRecycler() = with(binding){
        rvIngredients.adapter = adapter
    }

    private fun observeData() = with(binding) {
        viewModel.data
            .onEach {
                tvTitle.text = it.title
                tvRecipeDescription.text = it.description
                adapter.submitList(it.ingredientAndMeasure)
                viewModel.loadImage(ivProduct, it.imgUrl)
            }
            .launchIn(lifecycleScope)
    }

}