package Algorithm

fun main() {

    val array = Array<Int>(5){
        readLine()!!.toInt()
    }
    var max = 0
    var min = 100
    var sum = 0

//    for (j in array.iterator()){
//        println("iterator = ${j}")
//    }
//    for(j in array.indices){
//        println("indices = ${j}")
//    }
//    for(j in array){
//        println("array = ${j}")
//    }

    for (j in array){
        sum += j
        if (min > j){
            min = j
        }

        if (max < j){
            max = j
        }
    }

    println("max : $max min : $min sum : $sum")





}