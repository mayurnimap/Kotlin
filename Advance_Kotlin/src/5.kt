

//Any object is same as object class in kotlin

//https://chat.openai.com/c/bb30801d-3275-4d17-bcf5-a2c64dd9fdb3
//go on the above link for referece

fun main()
{
    val ref1 = P2("mayur")
    val ref2 = P2("mayur")

    println(ref1)
    println(ref2)

    println(ref1==ref2)
    println(ref1.hashCode())


//

    val ref3 =  P3("mayur",20)



//    if we print ref3 then we will get the name mayur and class name properly unlike ref add
//    this is because we have made this class as data class so we dont have type the boiler code
    println(ref3)

//    now if we want to change the age of the same  instance then
    val modifiedp3 = ref3.copy(age = 99)
    println(modifiedp3)

//     this can be only possible using data class ....
}





class P2(val name:String){


}



//if we prefix it with the data then
data class P3(val name:String, val age:Int){

}

