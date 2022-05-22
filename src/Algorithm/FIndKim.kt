package Algorithm

fun main() {
    val seoul = listOf<String>("12","124","632341","34567","34567","Kim")

    var count = 0
    for (i in seoul){
        if (i.equals("Kim")){
            break
        }
        count++
    }
    println("김서방은 ${count}에 있다")
}