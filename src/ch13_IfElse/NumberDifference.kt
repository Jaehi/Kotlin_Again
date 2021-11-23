package ch13_IfElse

//두 수의 차이를 양의 정수로 구하기

fun main() {
    var first = 4
    var second = 6
    var diff = 0

    if (first > second){
        diff = first - second
    }else{
        diff = second - first
    }
    println("$first 와 $second 의 차이는 $diff")
}