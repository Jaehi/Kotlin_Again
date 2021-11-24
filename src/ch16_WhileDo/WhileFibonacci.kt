package ch16_WhileDo

fun main() {

    var first = 0
    var second = 1

    var count = 0
    while (second <= 20){
        println(second)
        val temp = first + second
        first = second
        second = temp
    }
}