package Algorithm.second

fun main() {
    val number = readLine()?.toInt() ?: 0
    val list = IntArray(number) { 2 }
    var result = 1
    for (i in list){
        result *= list[i]
    }
    println(result)
}