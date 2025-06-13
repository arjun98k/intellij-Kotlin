package OOPS

class Secondary {
    var name: String = ""
    var id : Int = 0
    constructor(name: String , id: Int){
        this.name = name
        this.id = id
        println("hello my name is ${name} and my employee id is ${id}")
    }
}

fun main(){
    var second = Secondary("arjun",23)

}