fun main()
{
    var p1 = P1("mayur",20)

    println(p1.age1)
    println(p1.name1)
    p1.age1 = -5
}

class P1(name:String, age:Int)
{

//                                GETTER CONCEPT
//              in this we have converted the name1 into uppercase using method
    var name1:String = name
        get() {
             return field.toUpperCase()

        }

//                               SETTER CONCEPT
//   in this we have set the condtion that value can only be change if it more than 0
//   as soon as we try to get the age 1 set method will be called
//   if we dont set any getter and setter method then by default compiler will automatically set it
    var age1 : Int = age
        set(value) {
            if(value>0) // value means whatever user is trying to set the value
            {
                field = value
//             field is the default value that is there in setter method

            }
            else
            {
                println("value cant be negative")

            }
        }
}