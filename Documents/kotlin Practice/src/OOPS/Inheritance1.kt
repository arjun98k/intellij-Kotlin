package OOPS

open class Inheritance1 {
    fun fly(){
        println("birds can fly")
    }

}

class duck: Inheritance1(){
    fun swim(){
        println("duck can swim")
    }

}

fun main(){
    var obj1 = Inheritance1()
    var obj2 = duck()
    obj1.fly()
    obj2.swim()
}