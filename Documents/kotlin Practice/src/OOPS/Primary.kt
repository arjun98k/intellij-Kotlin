package OOPS


    class Primary(val name: String , var age:Int){

    }


fun main(){
    val primary = Primary("Arjun",20)
    println("name of Og dev " + primary.name)
    println("age  of ${primary.name}  is ${primary.age}")

}