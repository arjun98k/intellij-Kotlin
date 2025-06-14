package OOPS

data class dataclass(val name: String,val age: Int) {
}

fun main(){
    val obj1 = dataclass("Arjun",24)
    val obj2 = dataclass("Aditya",22)
    println(obj1)
}