package Algorithm

fun main() {

    val number = readLine().toString()

    var result = 0

    for (i in number){
        when(i){
            '0' -> result +=6
            '1' -> result +=2
            '2' -> result +=5
            '3' -> result +=5
            '4' -> result +=4
            '5' -> result +=5
            '6' -> result +=6
            '7' -> result +=3
            '8' -> result +=7
            '9' -> result +=6
            else -> "ERROR"
        }
    }

    println(result)

}