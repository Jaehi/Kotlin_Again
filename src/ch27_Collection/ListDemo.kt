package ch27_Collection

fun main() {
    val techs = listOf("kotlin","c","python","java")
    println(techs.get(1))
    println(techs[3])
    println(techs::class.qualifiedName)

    val subs = techs.subList(1,3)
    subs.forEach{
        println(it)
    }

    val sites = mutableListOf("Nexon","Riots")
    sites[1] = "Riot"
    sites.removeAt(0)
    sites.forEach{
        println(it)
    }
}