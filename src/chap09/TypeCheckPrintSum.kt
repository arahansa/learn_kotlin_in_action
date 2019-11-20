package chap09

import java.lang.IllegalArgumentException


fun printSum(c:Collection<*>){
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

inline fun <reified T> isA(value:Any) = value is T
fun main() {
    println(isA<Int>(1)) // true

    printSum(listOf(1,2,3))



    // printSum(setOf(1,2,3)) // set 에서는 List is expected
    // printSum(listOf("a", "b", "c")) // as 는 통과하지만, classCastException 등장

}
