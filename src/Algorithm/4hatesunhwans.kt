package Algorithm

fun main() {
    val number = readLine()!!.toInt()
    var list = arrayListOf<Int>()
    for (i in 1..number) {
        val result = i.toString()
        if (result.contains("4")) {
            continue
        } else {
            println(result)
        }

    }
}



