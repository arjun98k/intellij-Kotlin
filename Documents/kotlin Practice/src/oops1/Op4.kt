package oops1

interface clickable {fun onClick()}
interface focusable {fun onFocusable()}

class Button: clickable, focusable{
    override fun onClick() {
      println("you just click")
    }

    override fun onFocusable() {
        println("you just focus")
    }
}

fun main(){
    val btn = Button()
    btn.onClick()
    btn.onFocusable()
}

