package ch10_AssignmentIncrement

fun main() {
    var i = 100
    var j = 200

    println("처음 $i $j")

    var temp : Int = i
    i = j
    j = temp

    println("변경 $i $j")
}