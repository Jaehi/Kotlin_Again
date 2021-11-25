package ch24_Class

data class Customer(var name : String, var Id : Int, var city : String)

fun main() {
    var customer = Customer("김마마",0,"에레이")
    println(customer)

    var customers = arrayOf(Customer("김나나",2,"도쿄"),Customer("김아아",1,"베이징"))
    for (cust in customers){
        println("Name : ${cust.name} ID : ${cust.Id} City : ${cust.city}")
    }
}