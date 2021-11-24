package ch17_BreakContinue
//1부터 10까지의 정수를 더할때 합이 22 이상이면 멈춤
fun main() {
    var sum = 0
    var i = 0
    while (i <= 10){
        sum += i
        if (sum <= 22){
            break
        }
        i++
    }
    println(sum)

}