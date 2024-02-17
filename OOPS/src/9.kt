
//               OVERRIDNG ANY(SUPER CLASS) METHODS SUCH AS TOSTRING,EQUALS AND HASHCODE

fun main() {
    val square = Square()
    println(square)  //instead of printing the add it will print our data

    

}



class Square {

//    overrriding the tostring method

    override fun toString(): String {
        return "MAYUR IS THE BEST"
    }
}



