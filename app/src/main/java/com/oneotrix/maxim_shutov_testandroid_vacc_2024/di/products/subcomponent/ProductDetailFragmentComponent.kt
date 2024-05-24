package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.subcomponent

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details.ProductDetailsFragment
import dagger.Subcomponent

@Subcomponent
interface ProductDetailFragmentComponent {

    fun inject(fragment: ProductDetailsFragment)

    @Subcomponent.Builder
    interface Builder {
        fun builder() : ProductDetailFragmentComponent
    }
}