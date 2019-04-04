package chap02

import java.util.Random

fun createRandomRectangle(): Rectangle1{
    val random = Random()
    return Rectangle1(random.nextInt(), random.nextInt())
}

class Rectangle1(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

