package OOPS

class Generics1<T> (input:T) {
    var age:T
    init {
        age = when (input){
            is Double -> kotlin.math.round(input) as T
            is Float -> kotlin.math.round(input).toFloat() as T
            is Int -> input // already rounded
            is Long -> input
            else -> input // non-number types
        }
        println(age)

    }
}

fun main(){
    var obj1: Generics1<Int> = Generics1<Int>(21)
    var obj2: Generics1<String> = Generics1<String>("27")
    var obj3: Generics1<Double> = Generics1<Double>(22.01)


}