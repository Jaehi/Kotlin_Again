package ch15_For

fun main() {
    // 4! = 4*3*2*1
    var n = 10
    var fact = 0
    for (i in 1..n){
        println("$i ! -> ")
        fact = 1
        for (j in 1..i){
            fact *= j
        }
        println(fact)
    }
}