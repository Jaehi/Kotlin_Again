package Algorithm

import kotlin.math.PI

fun main() {

    val count = readLine()!!.toInt()
    val number = Array<Int>(count){ readLine()!!.toInt()}

    var result = 0
    number.forEach {
        if (result < it){
            result = it
        }
    }

    number.forEach { number ->
        if(result > number) result = number
    }

    println(result)
}