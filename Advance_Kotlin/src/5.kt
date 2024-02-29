

//Any object is same as object class in kotlin

fun main()
{
    val ref1 = P2("mayur")
    val ref2 = P2("mayur")

    println(ref1)
    println(ref2)

    println(ref1==ref2)
    println(ref1.hashCode())


//

    val ref3 =  P3("mayur")

//    if we print ref3 then we will get the name mayur and class name properly unlike ref add
//    this is because we have made this class as data class so we dont have type the boiler code
    println(ref3)
}





class P2(val name:String){


}



//if we prefix it with the data then
data class P3(val name:String){

}

