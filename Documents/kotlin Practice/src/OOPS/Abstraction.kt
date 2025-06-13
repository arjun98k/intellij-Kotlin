package OOPS

abstract class Abstraction {
    abstract fun run()
    fun sleep(){
        println("Abstraction class sleep")
    }
}

class abs1: Abstraction(){
       override fun run(){
        println("abs1 is running")
    }
}

fun main(){
    var obj1 = abs1()
    obj1.run()
    obj1.sleep()
}