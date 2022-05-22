package Algorithm

fun main() {
    val number = readLine()!!.toInt()
    val result = arrayListOf<Int>()
    var k = 0
    for (i in 3..number){
        for (j in 1..i){
            if (i%j == 0){
                k++
            }
        }
        if (k < 3){
            result.add(i)
        }
        k = 0
    }
    println(result)

}