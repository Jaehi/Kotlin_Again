package ch08_readline

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("정수를 입력해 주세요")
    val number = scanner.nextInt()
    println("실수를 입력해 주세요")
    val real = scanner.nextDouble()
    println("${number}-${real}")

}