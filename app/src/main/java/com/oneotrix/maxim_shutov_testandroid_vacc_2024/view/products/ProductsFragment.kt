package com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.App
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.MainActivity
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.R
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.databinding.FragmentProductsBinding
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.BaseFragment
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products.adapter.ProductsAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

class ProductsFragment: BaseFragment<FragmentProductsBinding>(
    FragmentProductsBinding::inflate
) {

    @Inject
    lateinit var viewModelFactory: ProductsViewModelFactory

    private val viewModel: ProductsViewModel by viewModels { viewModelFactory }

    private val adapter by lazy {
        ProductsAdapter{ id ->
            navigateToProductDetailsFragment(id)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        App.productsComponent.productsFragmentComponentBuilder()
            .build()
            .inject(this@ProductsFragment)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        observeData()
    }

    private fun observeData() {
        viewModel.data
            .onEach { state ->
                adapter.submitList(state.meals)
            }
            .launchIn(lifecycleScope)
    }

    private fun initRecycler() = with(binding){
        val decorator = DividerItemDecoration(context, RecyclerView.VERTICAL)

        rvProducts.adapter = adapter
        rvProducts.addItemDecoration(decorator)
    }

    private fun navigateToProductDetailsFragment(id: String) {
        val bundle = bundleOf(
            "id" to id
        )

        MainActivity.navigationComponent.navigationController().navigate(
            R.id.action_productsFragment_to_productDetailsFragment,
            bundle
        )
    }

}