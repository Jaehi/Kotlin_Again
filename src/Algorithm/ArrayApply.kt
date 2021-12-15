package Algorithm

fun main() {

    val array = Array<Int>(5){
        readLine()!!.toInt()
    }
    var max = 0
    var min = 100
    var sum = 0

    for (j in array){
        sum += j
        if (array[0] > j){
            min = j
        }else{
            min = array[0]
        }

        if (array[0] < j){
            max = j
        }else{
            max = array[0]
        }

    }
    println("max : $max min : $min sum : $sum")





}