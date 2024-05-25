package com.oneotrix.maxim_shutov_testandroid_vacc_2024.data.network

import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductDetailModel
import com.oneotrix.maxim_shutov_testandroid_vacc_2024.domain.model.ProductModel
import kotlinx.serialization.Serializable

@Serializable
data class MealNetModel(
    var idMeal: String = "",
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
) {
    companion object {
        fun map(mealNetModel: MealNetModel) : ProductModel {
            return ProductModel(
                id = mealNetModel.idMeal,
                title = mealNetModel.strMeal.orEmpty(),
                description = "${mealNetModel.strCategory}\n${mealNetModel.strArea}",
                imgUrl = mealNetModel.strMealThumb.orEmpty()
            )
        }

        fun mapToDetailModel(mealNetModel: MealNetModel) : ProductDetailModel {

            val ingredientsAndMeasure = mutableMapOf<String, String>()
            ingredientsAndMeasure[mealNetModel.strIngredient1!!] = mealNetModel.strMeasure1.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient2!!] = mealNetModel.strMeasure2.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient3!!] = mealNetModel.strMeasure3.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient4!!] = mealNetModel.strMeasure4.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient5!!] = mealNetModel.strMeasure5.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient6!!] = mealNetModel.strMeasure6.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient7!!] = mealNetModel.strMeasure7.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient8!!] = mealNetModel.strMeasure8.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient9!!] = mealNetModel.strMeasure9.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient10!!] = mealNetModel.strMeasure10.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient11!!] = mealNetModel.strMeasure11.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient12!!] = mealNetModel.strMeasure12.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient13!!] = mealNetModel.strMeasure13.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient14!!] = mealNetModel.strMeasure14.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient15!!] = mealNetModel.strMeasure15.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient16!!] = mealNetModel.strMeasure16.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient17!!] = mealNetModel.strMeasure17.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient18!!] = mealNetModel.strMeasure18.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient19!!] = mealNetModel.strMeasure19.orEmpty()
            ingredientsAndMeasure[mealNetModel.strIngredient20!!] = mealNetModel.strMeasure20.orEmpty()

            return ProductDetailModel(
                id = mealNetModel.idMeal,
                title = mealNetModel.strMeal.orEmpty(),
                description = mealNetModel.strInstructions.orEmpty(),
                ingredientsAndMeasure = ingredientsAndMeasure,
                imgUrl = mealNetModel.strMealThumb.orEmpty()
            )
        }
    }
}



