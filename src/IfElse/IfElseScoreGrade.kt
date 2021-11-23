package IfElse

fun main() {
    print("점수 : ")
    var score : Int = readLine()?.toIntOrNull() ?: 0
    var grade : String

    if (score >= 90){
        grade = "A"
    }else{
        if (score >= 80){
            grade = "B"
        }
        else{
            if (score >= 70){
                grade = "C"
            }
            else{
                grade = "F"
            }
        }
        println("당신의 점수는 $grade")
    }
}