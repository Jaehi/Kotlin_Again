package Algorithm

import java.util.*
import kotlin.math.PI

fun main() {
    val size = readLine()!!.toInt()
    val numbers = ArrayList<IntArray>()
    val list = arrayListOf(0,1,2,3,4,5,6,7,8,9)
    var result = 0

    for (i in 0 until size){
        numbers.add(readLine()!!.split(" ")!!.map { it.toInt() }.toIntArray())
    }



    for (k in list){
        result += k
    }
    println(result)
}