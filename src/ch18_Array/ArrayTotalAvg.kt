package ch18_Array

fun main() {
    val kor : IntArray = intArrayOf(100,85,14,78,33)
    var total = 0
    var avg : Double = 0.0
    for (score in kor){
        total += score
    }

    avg = total / kor.size.toDouble()

    println(avg)


}