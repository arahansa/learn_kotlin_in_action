package chap05


class Book(val title:String, val authoes:List<String>)

fun main() {
    var people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.filter{it.age > 30})
    val maxAge = people.maxBy(Person::age)!!.age

    val canBeInClub27 = {p:Person -> p.age <= 27}
    // 모두 만족하는지
    println(people.all(canBeInClub27))
    // 하나라도 만족하는지
    println(people.any(canBeInClub27))
    // 몇개 만족하는지
    println(people.count(canBeInClub27))
    // 그냥 찾기
    println(people.find(canBeInClub27))

    // 나이별로 묶기
    println("나이별로 묶는 groupBy : "+people.groupBy{it.age})


    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books = listOf(Book("짜라투스트라", listOf("니체")),
        Book("예언자", listOf("칼릴 지브란", "니체")),
        Book("하늘과 달과 별", listOf("윤동주"))
        )
    println(books.flatMap { it.authoes }.toSet())
}