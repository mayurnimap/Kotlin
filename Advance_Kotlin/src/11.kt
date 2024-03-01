


// here we will learn about the map from the collection
// in this also we will talk about the key and value pair because map collection work like this
// in this also we have mutable and unmutable
// first we will see about the mutable means which can be change

fun main()
{

    val d = mutableMapOf<Int,String>()

    d.put(1,"aa") // here we add element with the help of put method
    d.put(2,"bb")
    d.put(3,"cc")
    d.put(4,"dd")

    println(d.get(3))  // here we are accesing it with the id
    println(d.get(12))  // this will give you the null value

    for ((key,value) in d)   // this loop is used for map collection alternative of for loop
    {
        println("$key = $value")
    }

    d[8] = "jones"  // here we are adding in collection d with the id 8  

    println(d[8])




}