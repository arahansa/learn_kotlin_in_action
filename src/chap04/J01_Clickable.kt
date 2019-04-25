package chap04

interface Clickable{
    fun click()
    fun showOff() = println("I'm Clickable")
}

interface Focusable{
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "Lost"} Focus")
    fun showOff() = println("I'm Focusable")
}

class Button: Clickable, Focusable{
    override fun click() {
        println("I was clicked.")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}



fun main() {
    Button().click()
}