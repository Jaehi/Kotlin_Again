package ch12_Bitwise

import kotlin.experimental.and

fun main() {
    var x : Byte = 0b1010 // 10
    var y : Byte = 0b1100 // 12

    println(x)
    println(y)

    var z : Byte = x and y
    println(z)
}