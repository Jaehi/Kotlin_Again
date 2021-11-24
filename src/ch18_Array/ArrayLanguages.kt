package ch18_Array

fun main() {
    var languages = arrayOf("kor","eng","jpn")
    //languages.set(2,"일본")
    languages[2] = "일본"

    for (lan in languages){
        println(lan)
    }

    var intarr : IntArray = intArrayOf(1,2,3,4)
    for (int in intarr){
        println(int)
    }

    var floararr : FloatArray = floatArrayOf(1.1f,2.2f,3.3f,4.4f)
    for (float in floararr){
        println(float)
    }
}