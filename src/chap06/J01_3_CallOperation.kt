package chap06

import java.lang.IllegalArgumentException

class Address(val streetAddress: String, val zipCode: Int, val city:String,  val country: String)
class Company(val name:String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person.countryName(): String{
    val country = this.company?.address?.country
    return if(country!=null) country else "Unknown"
}

fun Person.countryName2() = company?.address?.country ?: "UnKnown"

fun printShppingLabel(person: Person){
    val address = person.company?.address ?: throw IllegalArgumentException("No Address")
    with(address){
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main() {
    val person = Person("Dmitry",null)
    println(person.countryName())


}