package chap01

data class Person(val name:String, val age:Int? = null)

fun main(){

    val persons = listOf(Person("영희"), Person("철수", 29))

    // 리스트에서 가장 나이가 많은 사람을 찾기 위해 maxBy 함수를 사용
    // it 이라는 이름을 사용하면 람다식의 유일한 인자를 찾을 수 있다.
    // 엘비스 연산자라고부르는 ?: 는 age 가 null 인 경우 0을 반환하고 그렇지 않은 경우 age 를 반환
    val oldest = persons.maxBy { it.age ?: 0 }
    println("나이가 가장 많은 사람 : $oldest")
}

