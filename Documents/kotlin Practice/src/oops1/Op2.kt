package oops1

class Op2 {
    private  var _age = 0

    var age: Int
        get() = _age

        set(value) {
            if (value >=0 ){
                _age = value
            } else{
                println("Invalid age. Age cannot be negative.")
            }
        }
}

fun main(){
    val obj = Op2()
        obj.age = 25
    println(obj.age)
    val obj2 = Op2()
    obj2.age = -20
    println(obj2.age)
}
