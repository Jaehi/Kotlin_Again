package Algorithm

fun main() {
    var number = readLine()?.toInt()
    val list = listOf<Int>(1,2,4,8,16,32,64,128)
    var A = 0
    var B = 0
    var C = 0
    var D = 0

    if (number != null){
        for (i in 0.. number){
            if (A == 255 || number == 0){
                break
            }else{
                A += list[i]
                number -= 1
            }
        }
        for (i in 0.. number){
            if (B == 255 || number == 0){
                break
            }else{
                B += list[i]
                number -= 1
            }
        }
        for (i in 0.. number){
            if (C == 255 || number == 0){
                break
            }else{
                C += list[i]
                number -= 1
            }
        }
        for (i in 0.. number){
            if (D == 255 || number == 0){
                break
            }else{
                D += list[i]
                number -= 1
            }
        }
    }

    println("$A.$B.$C.$D")
}