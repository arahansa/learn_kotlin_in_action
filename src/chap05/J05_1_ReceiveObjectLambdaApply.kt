package chap05

import java.lang.StringBuilder

// apply 식을 넣으면 함수의 본문에 간단한 식을 넣을 수 있다
// 초기화?같은 개념이랄까 흠..
fun alphabetApply() = StringBuilder().apply {
    for(letter in 'A'..'Z')
        append(letter)
    append("\n Now I know the alphabet!")
}.toString()

// 표준라이브러리의 buildString 을 통해서 StringBuilder를
// 만들어주는 일과 toString을 만들어주는 일을 자동화
fun alphabet4() = buildString {
    for(letter in 'A'..'Z')
    append(letter)
    append("\n Now I know the alphabet!")
}

fun main() {
    println(alphabetApply())
    println(alphabet4())
}