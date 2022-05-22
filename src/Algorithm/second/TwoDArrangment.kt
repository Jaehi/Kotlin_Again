package Algorithm.second


fun main() {
    val first = arrayOf(
        arrayOf(readLine()?.split(" ")),
        arrayOf(readLine()?.split(" "))
    )

    val second = arrayOf(
        arrayOf(readLine()?.split(" ")),
        arrayOf(readLine()?.split(" "))
    )

    val first1 = arrayListOf<Int>()
    val first2 = arrayListOf<Int>()
    val second1 = arrayListOf<Int>()
    val second2 = arrayListOf<Int>()

    var count1 = 0
    var count2 = 0

    for (i in first) {
        count1++
        for (j in i) {
            for (k in j!!.iterator()) {
                val number = k.toInt()
                if (count1 == 1) {
                    first1.add(number)
                } else {
                    first2.add(number)
                }
            }
        }
    }

    for (i in second) {
        count2++
        for (j in i) {
            for (k in j!!.iterator()) {
                val number = k.toInt()
                if (count2 == 1) {
                    if (number != null) {
                        second1.add(number)
                    }

                } else {
                    if (number != null) {
                        second2.add(number)
                    }
                }

            }
        }
    }

    for (i in first1.indices) {
        first1[i] *= second1[i]
    }
    for (i in first2.indices) {
        first2[i] *= second2[i]
    }

    println(first1)
    println(first2)

}