package Algorithm

import kotlin.math.PI

fun main() {

    val Number = readLine()
    var result = arrayListOf<Int>()
    var rresult = 1
    var rrresult = 0

    for (i in 0 until Number!!.toInt()){
        result.add(i)
    }
    for (j in result){
        rresult += j

        rrresult += rresult
        println(rrresult)
    }


}
