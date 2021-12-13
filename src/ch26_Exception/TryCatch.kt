package ch26_Exception

fun main() {
    try {
        var arr = arrayOf(1,2)
        arr[100] = 1234
    }catch (ex : Exception){
        println("${ex}")
    }
}

