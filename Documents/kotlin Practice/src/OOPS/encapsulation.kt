package OOPS

class encapsulation {
    private var age: Int = 0

    fun setAge(hold: Int){
        if (hold >= 0){
            age = hold
        } else{
            println("age cant be negative")
        }
    }
    fun getAge(): Int {
    return age
    }
}

fun main(){
    var obj = encapsulation()
    obj.setAge(-12)
    println(obj.getAge())
}