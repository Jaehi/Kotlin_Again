package Algorithm.second

import java.util.Random

fun main() {
    val number = readLine()?.toInt() ?: 0
    var random = Random()
    var result = arrayListOf<Int>()
    var count = 0

    do {
        var rand = random.nextInt(number+1)
        var last = 0
        if (count == 0) {
            if (rand != 0) {
                result.add(rand)
                count++
            }
        } else {
            if (rand != 0) {
                for (i in result) {

                    if (i != rand) {
                        last++
                    }
                }
                if (last == result.size) {
                    result.add(rand)
                    last = 0
                }
//                println(last)
//                println(rand)
//                println(result)
//                println(result.size)
                count++

            }
        }

    } while (result.size != number)

    for (i in result) {
        println(i)
    }
}



