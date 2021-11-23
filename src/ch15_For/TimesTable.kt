package ch15_For

fun main() {
    for (i in 1..9){
        print("${String.format("%4s",i)} 단")
    }
    println()
    for (i in 1..9){ //행 출력
        for (j in 1.. 9){ //열 출력

            print("$j * $i = ${String.format("%2s",(j*i))}")

        }
        println()
    }
}