package oops1
fun main() {
    val obj1 = Engineer("Arjun","seinor Engineer")
    val obj2 = Engineer("Aditya","It","android")



}

class Engineer(    val name: String,
                   val designation: String,
                   val Position: String,
                    val salary: Int)

{
    constructor(name: String, designation: String):this(name,designation,"seinor engineer",25000){
              println("this name of dev $name and $designation")
    }
    constructor(name: String,designation: String,Position: String):this(name,designation,Position,25000) {
             println("this name of developer $name and $designation and holding position $Position and salary $salary")
    }



}

