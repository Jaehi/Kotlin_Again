package ch12_Bitwise

import kotlin.experimental.inv

fun main() {
    var x : Byte = 0b1010 // 10

    println(x)

    var z : Byte = x.inv()
    println(z)
}