package ch16_WhileDo

fun main() {
    var sum = 0
    var count = 1
    while (count <= 100){
        if (count % 2 == 0){
            sum += count
        }
        count++
    }
    println(sum)
}