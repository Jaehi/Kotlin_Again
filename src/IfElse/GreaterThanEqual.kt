package IfElse

fun main() {
    print("첫 번째 수 : ")
    var first : Int = readLine()?.toIntOrNull() ?: 0

    print("두번째 수 : ")
    var second : Int = readLine()?.toIntOrNull() ?: 0

    if (first > second){
        println("큰 값 : $first")
    }else{
        println("큰 값 : $second")
    }
}