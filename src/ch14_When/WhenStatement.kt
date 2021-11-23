package ch14_When

fun main() {
    println("가장 좋아하는 프로그래밍 언어 ")
    println(" 1 . Kotlin \t 2 . C\t 3 . C++\t 4 . C#\t 5 . Java")

    val choice = readLine()?.toIntOrNull() ?: 0
    when(choice){
        1 -> println("kotlin 짱")
        2 -> println("C 짱")
        in 3..5 -> println("C++ or Java짱") // !in
        else -> {
            println("Java 짱")
        }
    }
}