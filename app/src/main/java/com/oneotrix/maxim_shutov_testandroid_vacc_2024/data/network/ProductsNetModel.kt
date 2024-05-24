package com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.network

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductModel
import kotlinx.serialization.Serializable

@Serializable
data class ProductsNetModel(
    var meals: List<Meal> = listOf()
) {
    @Serializable
    data class Meal(
        var idMeal: String,
        var strMeal: String? = null,
        var strDrinkAlternate: String? = null,
        var strCategory: String,
        var strArea: String? = null,
        var strInstructions: String? = null,
        var strMealThumb: String? = null,
        var strTags: String? = null,
        var strYoutube: String? = null,
        var strIngredient1: String? = null,
        var strIngredient2: String? = null,
        var strIngredient3: String? = null,
        var strIngredient4: String? = null,
        var strIngredient5: String? = null,
        var strIngredient6: String? = null,
        var strIngredient7: String? = null,
        var strIngredient8: String? = null,
        var strIngredient9: String? = null,
        var strIngredient10: String? = null,
        var strIngredient11: String? = null,
        var strIngredient12: String? = null,
        var strIngredient13: String? = null,
        var strIngredient14: String? = null,
        var strIngredient15: String? = null,
        var strIngredient16: String? = null,
        var strIngredient17: String? = null,
        var strIngredient18: String? = null,
        var strIngredient19: String? = null,
        var strIngredient20: String? = null,
        var strMeasure1: String? = null,
        var strMeasure2: String? = null,
        var strMeasure3: String? = null,
        var strMeasure4: String? = null,
        var strMeasure5: String? = null,
        var strMeasure6: String? = null,
        var strMeasure7: String? = null,
        var strMeasure8: String? = null,
        var strMeasure9: String? = null,
        var strMeasure10: String? = null,
        var strMeasure11: String? = null,
        var strMeasure12: String? = null,
        var strMeasure13: String? = null,
        var strMeasure14: String? = null,
        var strMeasure15: String? = null,
        var strMeasure16: String? = null,
        var strMeasure17: String? = null,
        var strMeasure18: String? = null,
        var strMeasure19: String? = null,
        var strMeasure20: String? = null,
        var strSource: String? = null,
        var strImageSource: String? = null,
        var strCreativeCommonsConfirmed: String? = null,
        var dateModified: String? = null
    )

    companion object {
        fun map(meal: Meal) : ProductModel {
            return ProductModel(
                id = meal.idMeal,
                title = meal.strMeal.orEmpty(),
                description = "${meal.strCategory}\n${meal.strArea}",
                imgUrl = meal.strMealThumb.orEmpty()
            )
        }
    }
}
