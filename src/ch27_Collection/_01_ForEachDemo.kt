package ch27_Collection

fun main() {
    val colors = arrayOf("red","blue","green",1,2,3,true)
    println(colors.size)
    for (c in colors){
        print("1 : $c \t")
    }
    println()
    colors.forEach {
        print("2 : $it \t")
    }
    println()
    colors.forEach {
        it ->
        println(it)
    }
    colors.forEachIndexed { index , c
    ->
        println("$index , $c")
    }

}