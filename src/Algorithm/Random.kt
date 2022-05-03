package Algorithm

import kotlin.random.Random

fun main() {

    val answer = Random.nextInt(100)

    for (i in 1..7){

        val number = readLine()?.toInt()

        if (number != null){
            if (answer < number){
                println("Down")
            }else if (answer > number){
                println("Up")
            }else{
                println("Correct")
                break
            }
        }
    }

    println("정답은 $answer")

}