

//throw exception
fun main()
{
    xyz(5)
    xyz(-2)
}






fun xyz(a : Int)
{
    if(a<0)
    {
        throw IllegalArgumentException("u have given the input less than 0")
    }
    else
    {
        println("given good marks that is $a")
    }



}