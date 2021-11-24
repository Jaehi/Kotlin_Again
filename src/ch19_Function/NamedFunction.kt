package ch19_Function

fun main() {
    println(summ(10,20))
    println(summ(second = 2, first = 4))
}

fun summ(first : Int, second : Int){
    println(first + second)
}