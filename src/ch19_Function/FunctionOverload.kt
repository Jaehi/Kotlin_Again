package ch19_Function

fun main() {
    multi()
    multi("Hello")
    multi("hahahahha",10)
}

fun multi(){
    println("Hi")
}
fun multi(message : String){
    println(message)
}
fun multi(message: String,count : Int){
    for (i in 1..count){
        println(message)
    }
}