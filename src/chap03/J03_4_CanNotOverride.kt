package chap03

open class View{
    open fun click() = println("View Clicked")
}

class Button: View(){
    override fun click() = println("Button Clicked")
}

fun main() {
    val view: View = Button()
    view.click() // Button Clicked

    fun View.showOff() = println("view?")
    fun Button.showOff() = println("button?")

    // 확장함수는 오버라이드 할 수 없다.
    view.showOff() // view

}