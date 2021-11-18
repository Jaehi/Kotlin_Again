package ch08_readline

fun main() {
    println("나이를 입력해 주세요")
    var templine = readLine() ?: "" //?:앞에 식이 null일 경우 초기화 값
    var age = templine.toIntOrNull() ?: 0
    println("당신의 나이는 $age 살 입니다.")

}