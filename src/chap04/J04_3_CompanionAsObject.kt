package chap04

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

class Person2(val name:String){
    companion object Loader{
        fun fromJSON(jsonText:String):Person2 = Person2(jsonText)
    }
}




interface JSONFactory<T>{
    fun fromJSON(jsonText:String): T
}

class Person3(val name: String){
    companion object : JSONFactory<Person2>{
        override fun fromJSON(jsonText: String): Person2 = Person2.fromJSON(jsonText)
    }
}

fun <T>loadFromJSON(factory: JSONFactory<T>): T{
    return factory.fromJSON("arahansa")
}

fun main() {
    val arahansa = Person2.Loader.fromJSON("arahansa")
    // Person3 의 이름으로 팩토리 전달
    loadFromJSON(Person3)
}

class Person4(val firstName: String, val lastName: String){
    companion object{}
}

fun Person4.Companion.fromJSON(json: String): Person4{
    return Person4(firstName = json, lastName = "")
}

/*
window.addMouseListener(
    object : MouseAdapter(){
        override fun mouseClicked(e: MouseEvent?) {
            super.mouseClicked(e)
        }
    }
)

fun countClicks(window: Window){
    var clickCount = 0
    window.addMouseListener(object: MouseAdapter(){
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }
    })
}
*/
