package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.subcomponent

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.products.ProductsFragment
import dagger.Subcomponent

@Subcomponent
interface ProductsFragmentComponent {

    fun inject(fragment: ProductsFragment)

    @Subcomponent.Builder
    interface Builder {
        fun build() : ProductsFragmentComponent
    }
}