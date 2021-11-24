package ch17_BreakContinue

fun main() {
     var count = 1
    loop@for (i in 1 .. 100){
        for (j in 1 .. 100){
            println("ㅎㅇ")
            if (count++ >= 5){
                break@loop
            }
        }
    }
}