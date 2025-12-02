package oops1
fun main() {
//    val obj = Op1("aksh", "android king")   // object created
//  obj.show()
//    val obj2 = Op1("Pro Android Developer")
}

class Op1(val name:String, val subposition: String) {
    constructor( occupation: String):this(occupation,"0") {
     println("i am super $occupation")
    }
    fun show(){
        println("hello kotlin")
        println("i am android develop $name and my roll no is $subposition")
    }
}