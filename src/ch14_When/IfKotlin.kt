package ch14_When

fun main() {
    var first = 4
    var second = 5
    val max = if (first > second) first else second
    println(max)

    val maxValue = if(first > second){
        println("first선택")
        first
    }else{
        println("second선택")
        second
    }

    println(maxValue)

}