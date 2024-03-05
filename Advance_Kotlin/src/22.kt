
// Vararg Keyword
// it stands for variable number of arguments
// so with the help of vararg keyword we can take any number of parameter but it should of same data type that we
// mention while creating the method

// reference link for generic and vararg keywords : https://chat.openai.com/c/9518ada9-5f55-4e97-9d72-3de04c56beca


fun main(){
    addition(1,2,3,4,5)
    addition(1,2)
    addition(1)
    addition() // if we dont pass anything then it will result in 0 
}


fun addition(vararg values : Int  )
{
    var sum = 0

    for (i in values)
    {
        sum +=i

    }

    println(sum)

}

// points to remember for this
// - Usage: You can only have one vararg parameter in a function, and it must be the last parameter in the parameter list.

// - Array Behind the Scenes: Internally, Kotlin converts the vararg parameters into an array. Within the function, you can access this parameter as if it were an array.

// - Calling Functions with vararg Parameters: When calling a function with a vararg parameter, you can pass individual values separated by commas, or you can pass an existing array using the spread operator (*).