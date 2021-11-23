package ch14_When

fun main() {
    println("라인을 선택해주세요")
    print("1: MID\t2: TOP\t3: JG\t4: AD\t5: SUP -> ")
    var line = readLine()?.toInt()

    when (line){
        1 -> println("MID Liner")
        2 -> println("TOP Liner")
        3 -> println("Jungler")
        4 -> println("AD Carry")
        5 -> println("Supporter")
        else -> {
            println("붐따")
        }
    }
}