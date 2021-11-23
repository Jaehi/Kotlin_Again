package ch11_RelationalLogical

fun main() {
    val i = 3
    val j = 5
    var r : Boolean

    r = (i == 3) || (j != 3)
    println(r) // true

    r = (i != 3) && (j == 3)
    println(r) //false

    r = ( i >= 5)
    println(!r) //true
}