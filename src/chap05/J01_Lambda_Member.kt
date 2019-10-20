package chap05

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>){
    var maxAge = 0
    var theOldest: Person? = null
    for(person in people){
        if(person.age > maxAge){
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main() {
    var people = listOf(Person("Alice", 2), Person("Bob", 31))
    println(findTheOldest(people))
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))
    println(people.maxBy(){p:Person -> p.age})
    println(people.maxBy{p:Person -> p.age})

    people = listOf(Person("이몽룡", 29), Person("성춘향", 31))
    val names = people.joinToString(" ", transform = {p: Person -> p.name})
    println(names)
    println(people.joinToString(" "){p:Person -> p.name})
}