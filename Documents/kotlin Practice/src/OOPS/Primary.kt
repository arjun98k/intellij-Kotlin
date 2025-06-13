package OOPS


    class Primary(val name: String , var age:Int){
   init {
       if (age > 18){
           println("his name ${name}")
       }
   }
    }


fun main(){
    val primary = Primary("Arjun",20)
    val primary2 = Primary("aditya",23)

//    println("name of Og dev " + primary.name)
//    println("age  of ${primary.name}  is ${primary.age}")

}