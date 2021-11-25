package ch23_Enum

enum class Animal{
    Rabbit,
    Pig,
    Dog,
    Ferret
}

fun main() {
    var jin = Animal.Ferret
    if (jin == Animal.Dog){
        println("개")
    }else if (jin == Animal.Ferret){
        println("페럿")
    }else println("Another")

    var jyan = Animal.Rabbit
    var result = when(jyan){
        Animal.Pig -> "돼지"
        Animal.Ferret -> "페럿"
        Animal.Dog -> "개"
        else -> "토끼"

    }
    println(result)
}