package OOPS

class Generics1<T> (age:T) {
    var age:T = age
    init {
        this.age = age
        println(age)
    }
}

fun main(){
    var obj1: Generics1<Int> = Generics1<Int>(21)
    var obj2: Generics1<String> = Generics1<String>("27")


}