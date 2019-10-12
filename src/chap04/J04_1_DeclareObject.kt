package chap04

import java.io.File


class Person

// 생성자는 객체 선언에 사용할 수 없다.
// 일반 클래스 인스턴스와 달리 싱글턴 객체는 객체 선언문이 있는 위치에서
// 생성자 호출 없이 즉시 만들어진다
object Payroll{
    val allEmployees = arrayListOf<Person>()
    fun calculrateSalary(){
        for(persin in allEmployees){

        }
    }
}

object CaseInsensitiveFileComparator : Comparator<File>{
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}


data class Person1(val name: String){
    object NameComparator: Comparator<Person1>{
        override fun compare(o1: Person1, o2: Person1): Int =
            o1.name.compareTo(o2.name)
    }
}

fun main() {
    val persons = listOf(Person1("Bob"), Person1("Alice"))
    println(persons.sortedWith(Person1.NameComparator))
}