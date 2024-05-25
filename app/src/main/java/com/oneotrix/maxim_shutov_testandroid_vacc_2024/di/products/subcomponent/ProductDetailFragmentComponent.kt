package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.subcomponent

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.view.product_details.ProductDetailsFragment
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent
interface ProductDetailFragmentComponent {

    fun inject(fragment: ProductDetailsFragment)

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun id(@Named("id") id: String) : Builder
        fun build() : ProductDetailFragmentComponent
    }
}