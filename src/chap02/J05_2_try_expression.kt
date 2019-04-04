package chap02

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber1(reader:BufferedReader){
    val number = try{
        Integer.parseInt(reader.readLine())
    }catch(e:NumberFormatException){
        null
    }
    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber1(reader)
}