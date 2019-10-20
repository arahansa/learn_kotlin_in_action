package chap05

fun main() {
    var people = listOf(Person("Alice", 2), Person("Bob", 31))


    // 코틀린의 지연계산 시퀀스는 Sequence 인터페이스에서 시작
    // 이 인터페이스는 단지 한번에 하나씩 열거될 수 있는 원소의 시퀀스를 표현할 뿐
    //
    val filtered = people.asSequence().map(Person::name).filter { it.startsWith("A") }.toList()
    println(filtered)

    val naturalNumbers = generateSequence(0){ it +1 }
    val numbersTo100 = naturalNumbers.takeWhile{it < 100}
    println(numbersTo100.sum())
}