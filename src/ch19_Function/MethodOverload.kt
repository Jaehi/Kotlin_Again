package ch19_Function

fun main() {
    getNumber(1)
    getNumber("1")
}

fun getNumber(number : Int){
    println("Int : $number")
}
fun getNumber(number : String){
    println("String : $number")
}