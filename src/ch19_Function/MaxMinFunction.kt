package ch19_Function

fun main() {
    println("비교하실 두 수를 입력해 주세요")
    var x = readLine()!!.toInt()
    var y = readLine()!!.toInt()

    println("1.Max 2.Min")
    var choo = readLine()!!.toInt()

    if (choo == 1){
        println(Max(x,y))
    }else if(choo == 2){
        println(Min(x,y))
    }else{
        println("ERROR")
    }

}

fun Max(x : Int , y : Int) : Int {
    return if (x > y) x else y
}

fun Min(x : Int , y : Int) : Int{
    return if (x < y) x else y
}