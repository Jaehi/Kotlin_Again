package ch19_Function

fun main() {

    println("더하실 숫자를 두 개를 입력해 주세요.")
    var x = readLine()!!.toInt()
    var y = readLine()!!.toInt()

    println(sum(x,y))


}

fun sum(x : Int , y : Int) : Int{
    return x + y
}