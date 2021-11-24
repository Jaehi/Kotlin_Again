package ch18_Array

fun main() {
    var numbers = arrayOf(1234,5678)
    println("${numbers[1]} + ${numbers[0]}")

    var phones = arrayOf(119,112,117)
    for (phone in phones){
        println(phone)
    }
}