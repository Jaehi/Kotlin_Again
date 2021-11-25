package ch21_API

import kotlin.math.*

fun main() {
    //수학 관련 상수
    println("자연 로그 : $E")
    println("원주율 : $PI")

    //절댓값
    println("-78의 절댓값 : ${abs(-78)}")

    //최댓값, 최솟값
    println("${min(6,8)} ${max(87,234)}")

    //거듭제곱
    println("2의 10승 : ${2.0.pow(10)}")

    //반올림
    println(round(5.6))
    println("%.3f".format(3.1683))
}