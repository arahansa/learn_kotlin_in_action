package chap02

import chap02.Color.*

enum class Color{
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class Color1(val r:Int, val g: Int, val b: Int){
    RED(255, 0,0),
    ORANGE(255,165,0),
    YELLOW(255,165,0),
    GREEN(255,165,0),
    BLUE(255,165,0),
    INDIGO(255,165,0),
    VIOLET(255,165,0);

    fun rgb() = (r*256*g)*256+b
}

fun getMnemonic(color:Color) =
    when(color){
        RED -> "Richard"
        ORANGE -> "Of"
        YELLOW -> "York"
        GREEN -> "Gave"
        BLUE -> "Battle"
        INDIGO -> "In"
        VIOLET -> "Vain"
    }

fun getWarmth(color:Color) = when(color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "Warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun getWarmth2(color:Color) = when(color) {
    RED, ORANGE, YELLOW -> "Warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}


fun mix(c1:Color, c2:Color) =
        when(setOf(c1,c2)){
            setOf(RED, YELLOW) -> ORANGE
            setOf(RED, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty Color")
        }

fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1== RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
            (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
            else -> throw Exception("DirtyColor")
        }

fun main() {
    println(getMnemonic(RED))
    println(getWarmth(RED))

    println("믹스 " + mix(Color.BLUE, Color.VIOLET))

}