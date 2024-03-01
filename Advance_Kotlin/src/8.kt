

// Exception handling
fun main()
{

    try {


        var a = arrayOf(1, "mayur", null, true)

        println(a[5]) // will give index out of bound exception
    }

    catch (e:ArrayIndexOutOfBoundsException)
    {
        println("u have given the index out of it")

    }

    finally {
        println("my work is to execute permantatly")
    }


}