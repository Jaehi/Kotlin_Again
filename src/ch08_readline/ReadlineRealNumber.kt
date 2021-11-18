package ch08_readline

fun main() {
    println("당신의 몸무게를 입력하세요.")
    val kg = readLine() ?: ""
    val weight : Double = kg.toDoubleOrNull() ?: 0.0
    println("당신의 몸무게는 $weight 입니다.")
}