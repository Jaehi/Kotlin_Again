package IfElse

fun main() {
    var number1 = 10
    var number2 = 20

    if (number1 > number2){
        println("$number1 이 더 큽니다")
    }else if (number2 > number1){
        println("$number2 이 더 큽니다")
    }else{
        println("둘 다 같습니다")
    }
}