package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.subcomponent.ProductDetailFragmentComponent
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.subcomponent.ProductsFragmentComponent
import dagger.Subcomponent

@Subcomponent(
    modules = [
        ProductsSubcomponents::class
    ]
)
interface ProductsComponent {


    fun productsFragmentComponentBuilder() : ProductsFragmentComponent.Builder

    fun productDetailsFragmentComponentBuilder() : ProductDetailFragmentComponent.Builder


    @Subcomponent.Builder
    interface Builder {
        fun build() : ProductsComponent
    }
}