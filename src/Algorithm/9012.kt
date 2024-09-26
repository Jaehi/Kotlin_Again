package Algorithm

fun main() {
    val count = readLine()!!.toInt()
    val stringArray = Array<String>(count) {
        readLine()!!.toString()
    }
    stringArray.forEachIndexed { index, string ->
        checkStatus(string.toMutableList())
    }
}

fun checkStatus(string: MutableList<Char>) {
    var tempString = string.toMutableList()
    var status = false
    var prevIndex = -1
    if (tempString.isEmpty()) {
        println("YES")
        return
    }
    run loop@{
        string.forEachIndexed { index, c ->
            if (index == 0 && c.equals(')')) {
                status = false
                return@loop
            }
            if (c.equals('(')) prevIndex = index
            if (c.equals(')')) {
                if (prevIndex != -1) {
                    tempString.removeAt(index)
                    tempString.removeAt(prevIndex)
                    status = true
                    return@loop
                } else {
                    status = false
                    return@loop
                }
            }
        }
    }
    if (status) {
        checkStatus(tempString)
    } else {
        println("NO")
    }
}