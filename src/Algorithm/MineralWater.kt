package Algorithm

fun main() {

    var number = readLine()?.toInt()
    var result = 0

    if (number != null) {
        result += 1 + number
        println(result)
        if (number % 2 == 0) {
            result += number / 2 + 2
            println(result)
        }
        if (number % 3 == 0) {
            result += number / 3 + 3
            println(result)
        }
        if (number % 5 == 0) {
            result += number / 5 + 5
        }
        if (number % 7 == 0) {
            result += number / 7 + 7
        }
    }
    println(result)
}
