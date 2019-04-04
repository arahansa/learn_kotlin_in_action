package chap02

import java.util.*

val binaryReps = TreeMap<Char, String>()

fun main() {
    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c]=binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    println("---")
    val list = arrayListOf("10", "11", "1001")
    for((index, element) in list.withIndex()){
        println("$index : $element")
    }
}