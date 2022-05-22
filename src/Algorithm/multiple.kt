package Algorithm

fun main() {
    val number = readLine()!!.toInt()
    val jjang = readLine()!!.toInt()
    val result = arrayListOf<Int>()
    var real = 0
    for (i in 0..number){
        if (i % jjang == 0){
            result.add(i)
        }
    }
    for (j in result){
        real += j
    }

    println(real)
}