package IfElse

fun main() {
    var score : Int
    var grade : String

    print("당신의 점수를 입력하세요 : ")
    score = readLine()?.toIntOrNull() ?: 0

    if (score >= 90) {
        grade = "A"
    }else if (score >= 80){
        grade = "B"
    }else if (score >= 70){
        grade = "C"
    }else{
        grade = "F"
    }

    println("당신의 점수는 $score 이며 $grade 등급 입니다.")
}