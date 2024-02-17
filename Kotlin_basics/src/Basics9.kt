fun main()
{

//    in kotlin array are hetrogenious

    var arr = arrayOf("one","two",2.0)

//    for(i in 0..arr.size-1)
//    {
//        println(arr[i])
//    }


//    New way

    for(i in arr)
    {
        println(i)
    }

//    we can also have get and set method to get the data in the array using index
//    and using set we can change the array element using index

    println(arr.get(0))
    arr.set(1,"mayur")
    println(arr[1])


}
