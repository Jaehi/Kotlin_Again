package ch22_DateTime

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    var current = LocalDateTime.now()
    println("현재 시간 : $current")

    var dateformatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")
    println("현재 시간 : ${current.format(dateformatter)}")

    println("날짜 : ${LocalDate.now()}")

    println("3일 뒤 : ${current.plusDays(3)}")
    println("3달 뒤 : ${current.plusMonths(3)}")
    println("97일 뒤 : ${current.plusDays(97)}")
}