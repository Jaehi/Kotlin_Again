package ch09_operator

fun main() {
    var days : Int = 29
    println("2월은 "+ days +"일 까지 있습니다") //암시적
    println("2월은 "+days.toString()+"일 까지 있습니다.") //명시적 (위에꺼보단좋음)
    println("2월은 ${days}일 까지 있습니다") //템플릿 string, 문자열 보간법(추천)
}