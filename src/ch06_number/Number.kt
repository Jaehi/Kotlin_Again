package ch06_number

fun main() {
    var min : Int = -2147483648 // 가장 작은 값
    var max : Int = 2147483647 //가장 큰 값이겠죠
    println("Int 변수의 가장 작은 값 : ${min}")
    println("Int 변수의 가장 큰 값 : ${max }")

    var PI : Double = 3.141592
    println("PI : ${PI}")

    var i  : Int = 1_000 //정수
    var b : Byte = 123 //작은 정수
    var s : Short = 1234 //정수
    var l : Long = 1234L //큰 정수
    var f : Float = 3.14F //32비트 실수
    var d : Double = 3.14 //64비트 실수

    //숫자 구분자
    val lValue = 2_147_483_647

    //형변환
    val ii : Int = 1234;
    val ll : Long = ii.toLong()

    var dbl = 12.34
    val iii : Int = dbl.toInt()
    println(iii)
}