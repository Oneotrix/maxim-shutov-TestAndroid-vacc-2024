package com.oneotrix.maxim_shutov_testandroid_vacc_2024.di.app.modules

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.Api
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.ProductsRepositoryImpl
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.repository.ProductsRepository
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideProductsRepository(api: Api) : ProductsRepository {
        return ProductsRepositoryImpl(
            api
        )
    }

}