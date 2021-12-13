package Algorithm

fun main() {
    val Number = readLine()!!.toInt()
    var list = arrayListOf<Int>()
    for (i in 1 .. Number) {
        val result = i.toString()
        if (result.contains("4")){
            continue
        }else{
            println(result)
        }
        }
}



