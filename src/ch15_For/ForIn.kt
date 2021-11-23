package ch15_For

fun main() {

    for (i in 1..5){
        print("$i\t")
    }
    println()

    for (i in 1..10 step 2){
        print("$i\t")
    }
    println()

    for (i in 10 downTo 1){
        print("$i\t")
    }
    println()

    for (i in 10 downTo 1 step 3){
        print("$i\t")
    }
    println()

    for (i in 1 until 10){
        print("$i\t")
    }
    println()

    for (c in "Say Hi to Jaehi"){
        print("$c\t")
    }
}