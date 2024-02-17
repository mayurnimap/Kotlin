
fun main()
{
    var result=mayur(10,20) //the data that we passed is known as argument
    println(result)

    var result1 = ed(9)
    println(result1)

    var result2 = yash(2,3)
    println(result2)

}

fun mayur(num1:Int,num2: Int):Int
//last one is return type and here we have to mention the data type whenever we r defining in the parameter
{
    var result = num1 + num2
    return result
}




fun yash(num1:Int,num2:Int) = num1 + num2
//    whenever we write the code on one line then we dont have to give the return type





fun ed(num1:Int):String
{

//    we have done the hardcode here we haven't written println statement
//    and written the whole code in one line
//    when we write any code in one line then it is known as inline

    var result = if(num1%2==0) "even" else "odd"
    return result

}