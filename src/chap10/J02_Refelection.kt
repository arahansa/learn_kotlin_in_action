package chap10


fun foo(x: Int) = println(x)

fun main() {

    val kFunction = ::foo
    // kFunction.call(42)
    kFunction.invoke(42)

    class Person(val name:String, val age: Int)
    val person = Person("Alice", 29)
    val memberProperty = Person::age
    println(memberProperty.get(person))
}