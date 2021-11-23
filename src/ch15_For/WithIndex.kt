package ch15_For

fun main() {
    for ((index, value ) in "Hello Jaehi".withIndex()){
        println("$index - $value")
    }
}