package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.products

import dagger.Subcomponent

@Subcomponent
interface ProductsComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build() : ProductsComponent
    }
}