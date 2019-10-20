package chap05

import java.lang.StringBuilder

fun alphabet(): String{
    val result = StringBuilder()
    for(letter in 'A'..'Z')
        result.append(letter)
    result.append("\n Now I know the alphabet!")
    return result.toString()
}

fun alphabetWith() : String{
    val stringBuilder = StringBuilder()
    // with 함수는 첫번째 인자로 받은 객체를, 두번째 인자로 람다의 수신객체로 받는다.
    return with(stringBuilder){
        for(letter in 'A'..'Z')
            this.append(letter)
        this.append("\n Now I know the alphabet!")
        return this.toString()
    }
}

fun alphabet3() = with(StringBuilder()){
    for(letter in 'A'..'Z')
        append(letter)
    append("\n Now I know the alphabet!")
    toString()
}

fun main() {
    println(alphabet())
    println("==========")
    println(alphabetWith())
    println("==========")
    println(alphabet3())
}