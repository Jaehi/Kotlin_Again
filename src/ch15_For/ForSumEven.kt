package ch15_For

fun main() {
    var n = 199
    var sum = 0

    for (i in 1..n){
        if (i%2 == 0){
            sum += i
        }else{
            continue
        }
    }
    println("1부터 $n 까지의 짝수의 합: $sum")
}