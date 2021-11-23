package ch14_When

fun main() {
    var x = 3
    when (x){
        1 -> println("x = 1입니다")
        2 -> println("x = 2입니다")
        else -> {
            println("나는 아무것도 아닙니다")
        }
    }
}