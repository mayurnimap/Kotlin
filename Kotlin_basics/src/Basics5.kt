fun main()
{


    for(i in 1..5)
    {
        println(i)
    }

    println("=========================================================================")


    for(i in 1..10 step 3)
    {
        println(i)
    }

//    above function states that we can skip any number of times  that we have staretd from 1 and increases
//    3 and then it become 4



//    above methods will print 1 to 5

    println("=========================================================================")



    for(i in 1 until 5)
    {
        println(i)
    }



//    above method will print from 1 to 4 because we have mention until so  will not print

    println("=========================================================================")



    for(i in 10 downTo 1)
    {
        println(i)
    }

//    this method we will used when we have to denote

    println("=========================================================================")


}