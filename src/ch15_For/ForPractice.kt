package ch15_For

fun main() {
    for (i in 1..9){
        println("$i 단")
        for (j in 1..9){
            println("$j * $i = ${j*i}")
        }
    }
}