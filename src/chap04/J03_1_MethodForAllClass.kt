package chap04

class Client(val name:String, val postalCode: Int)

class Client1(val name:String, val postalCode: Int){
    override fun toString(): String =  "Client(name=$name, postalCode=$postalCode)"
}

class Client2(val name:String, val postalCode: Int){
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client2)
            return false
        return name == other.name && postalCode == other.postalCode
    }
    override fun toString(): String =  "Client(name=$name, postalCode=$postalCode)"
}

class Client3(val name:String, val postalCode: Int){
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client2)
            return false
        return name == other.name && postalCode == other.postalCode
    }
    override fun toString(): String =  "Client(name=$name, postalCode=$postalCode)"
}

data class Client4(val name:String, val postalCode: Int)

fun main() {
    val client1 = Client1("최강용", 4122)
    println(client1)
    val client2 = Client1("최강용", 4122)
    println(client1 == client2)

    // equals 구현
    val client3 = Client2("최강용", 4122)
    val client4 = Client2("최강용", 4122)
    println(client3 == client4)


}