package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.subcomponent.ProductDetailFragmentComponent
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products.subcomponent.ProductsFragmentComponent
import dagger.Module

@Module(
    subcomponents =[
        ProductsFragmentComponent::class,
        ProductDetailFragmentComponent::class
    ]
)
class ProductsSubcomponents {
}