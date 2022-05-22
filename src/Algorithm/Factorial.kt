package Algorithm

fun main() {
    var number = 0
    val base = readLine()!!.toInt()
    var j = 0
    var k = 0
    if (0 <= base && base <= 13){
        number = base
        for (i in 1..number){
            if (i == 1){
                k = i*i
            }else{
                j = k*i
                k = j
            }
            println(j)
        }
    }else{
        println("잘못된 수를 입력했")
    }


}