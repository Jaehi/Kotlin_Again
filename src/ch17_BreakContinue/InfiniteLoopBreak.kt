package ch17_BreakContinue

fun main() {
    var num = 0
    while (true){
        println(++num)
        if (num == 5){
            break
        }
    }
}