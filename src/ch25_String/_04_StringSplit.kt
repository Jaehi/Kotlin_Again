package ch25_String

fun main() {
    var src = "마라탕|꿔바로우|돈까스|냉모밀|토스트|떡볶이|김치볶음밥|닭갈비"
    var menu = src.split("|")
    for (it in menu){
        println(it)
    }
}