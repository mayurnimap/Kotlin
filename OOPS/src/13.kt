
//                                   Interface

//https://www.youtube.com/watch?v=9LO0c05NSek&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G&index=24

fun main()
{
    dragObjects(arrayOf(Circle5(), Person()))
}

fun dragObjects(list: Array<Draggable>)
{
    for(obj in list)
    {
        obj.drag()
    }
}


interface Draggable
{
    fun drag()
}

class Circle5: Draggable
{
    override fun drag() = println("Circle is dragging")
}

class Person: Draggable
{
    override fun drag() = println("Person is dragging")
}




