package ch25_String

fun main() {
    var message = "Hello World!"
    println(message.length)
    println(message.toUpperCase())
    println(message.toLowerCase())

    println(message.replace("Hello","안녕").replace("World","세계"))
    println("ㅎㅇ".plus(" ").plus("ㅇㅎ"))
}