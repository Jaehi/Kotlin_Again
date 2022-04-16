package Algorithm

fun main() {
    val count: Int = readLine()!!.toInt()
    val list = ArrayList<String>()

    for (turn in 1..count) {
        var value = readLine()!!.split(" ")
        var count = 0
        for (item in value) {
            if (item == "0") {
                count++
            }
        }
        when (count) {
            0 -> list.add("U")
            1 -> list.add("G")
            2 -> list.add("K")
            3 -> list.add("D")
            4 -> list.add("M")
        }
        count = 0
        value = emptyList()
    }

    for (result in list) {
        print("$result ")
    }

}




