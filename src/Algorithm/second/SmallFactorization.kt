package Algorithm.second

fun main() {
    val number = readLine()?.toInt() ?: 0
    val resultList = arrayListOf<Int>()
    var temp = number

    do {
        if (temp % 7 == 0){
            temp /= 7
            resultList.add(7)
        }else if (temp % 5 == 0){
            temp /= 5
            resultList.add(5)
        }else if (temp % 3 == 0){
            temp /= 3
            resultList.add(3)
        }else if (temp % 2 == 0){
            temp /= 2
            resultList.add(2)
        }

    }while (temp != 3 && temp != 1)

    for (i in resultList){
        println(i)
    }
  //  노력추
    //오답 ! 노트해오셈.
}