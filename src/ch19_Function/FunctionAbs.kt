package ch19_Function

fun main() {
    println(abs(-6))
}

fun abs(n : Int) : Int {
    return if (n < 0) -n else n
}