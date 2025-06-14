package OOPS

data class dataclass(val name: String,val age: Int) {
}

fun main(){
    val obj1 = dataclass("Arjun",22)
    val obj2 = dataclass("Aditya",22)
    println(obj1)
    println(obj1.name == obj2.name)
    println("are there is age is same " + obj1.age.compareTo(obj2.age) )
    println(obj1.age == obj2.age)  // true or false

}