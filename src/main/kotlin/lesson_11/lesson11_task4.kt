package org.example.lesson_11

fun main() {

}

class Category(
    val id: Int ,
    val name: String ,
    val description: String ,
    val imageUrl: String ,
)

class Recipe(
    val id: Int ,
    val name: String ,
    val categories: Category ,
    val ingredients: List<Ingredient> ,
    val isFavorite: Boolean = false ,
    val imageUrl: String ,
    var amount: Int ,
    val description: String ,
)

class Ingredient(
    val id: Int ,
    val name: String ,
    val amount: Double ,
    val unit: Measure ,
)

enum class Measure {
    BIG_SPOON , TEASPOON , GRAMM , KILO , LITER , MILLILITER , PIECE , PINCH
}