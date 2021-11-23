package ch13_IfElse

fun main() {
    var number = 1_234

    //조건이 둘 다 성립할 경우
    if(number == 1_234 && number >= 1_000){
        println("Ok")
    }

    //조건중 하나라도 성립할 경우
    if (number == 1_234 || number <= 1_000){
        println("Ok")
    }
}