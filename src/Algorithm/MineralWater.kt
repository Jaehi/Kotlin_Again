package Algorithm

fun main() {

    var number = readLine()?.toInt()
    var result = 0
    //창의력대장
    if (number != null) {
        result += 1 + number
        println(result)
        if (number % 2 == 0) {
            result += number / 2 + 2
            println(result)
        }
        if (number % 3 == 0) {
            result += number / 3 + 3
            println(result)
        }
//        if (number % 5 == 0) {
//            result += number / 5 + 5
////            println(result)
//        }
//        if (number % 7 == 0) {
//            result += number / 7 + 7
//            println(result)
//        }
    }

//    var something = 0
//    for(i in 0..number!!){
//        if(number % i == 0 ){
//            something += i
//        }
//    }
//    println(something)
//    println(result)
}
