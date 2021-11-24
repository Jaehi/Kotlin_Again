package ch19_Function

fun main() {
    log("훙훙") //매개변수 하나만 사용
    log("홍홍",2) //매개변수 둘다 사용
}
fun log(message : String, level : Byte = 1){
    println("$message $level")
}