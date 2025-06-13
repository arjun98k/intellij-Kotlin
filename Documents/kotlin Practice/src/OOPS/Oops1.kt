package OOPS

class Oops1 {
    var name:String = " "
    var acc_no: Int = 0
    var amount: Float = 0.toFloat()

    fun  setdata(n: String , ac_no: Int , am: Float ){
        name = n;
        acc_no = ac_no
        amount = am

        println("name of employee " + name + " account number  " + acc_no  + " amount is account " + amount)
    }



}

fun main(){
    var oo = Oops1()
    oo.setdata("Arjun" , 9820,100f)

}