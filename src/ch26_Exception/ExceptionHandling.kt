package ch26_Exception

fun main() {
    var a = 3
    var b = 0
    var r = 0
    try {
        r = a / b
    }catch (e : Exception){
        println(e)
    }

    try {
        throw Exception("ERROR")
    }catch (e : Exception){
        println(e)
    }finally {
        println("Finall")
    }
}