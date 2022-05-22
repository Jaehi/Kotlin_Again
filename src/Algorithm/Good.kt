package Algorithm

fun main() {
    val A = readLine()?.toInt()
    val B = readLine()?.toInt()
    val N = B!! - A!!
    var result = 0

    for (a in 0..N){

        result += (a+A) * (B-a)

    }
    println(result)

}