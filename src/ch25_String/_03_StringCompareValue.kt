package ch25_String

fun main() {
    var s1 = "Kotlin"
    var s2 = "kotlin"

    if (s1 == s2){
        println("s1 == s2")
    }
    if (s1.equals(s2)){
        println("s1.equals(s2)")
    }
    if (s1.toUpperCase() == s2.toUpperCase()){
        println("s1.toUpperCase() == s2.toUpperCase()")
    }
    if (s1.equals(s2,true)){
        println("s1.equals(s2,true)")
    }
}