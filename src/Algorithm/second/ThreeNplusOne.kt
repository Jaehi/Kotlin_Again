package Algorithm.second

fun main() {
    val n = readLine()?.toInt() ?:0
    val result = arrayListOf<Int>()
    var temp = n

    do{
        if (temp % 2 == 0){
            temp /= 2
            result.add(temp)
        }else{
            temp = (temp*3)+1
            result.add(temp)
        }
        println("array:" + result)
    }while (temp != 1)

    println(result.size+1)
}