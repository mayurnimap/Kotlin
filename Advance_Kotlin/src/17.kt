
// FOR EACH LOOP


fun main()
{
    val a = listOf(1,2,3,4,5)



//  using simple for loop
    for (i in 0..a.size-1)
    {
        println(a[i])
    }

    println("===================================================")

//  using for each loop

    a.forEach{ println(it) }
}