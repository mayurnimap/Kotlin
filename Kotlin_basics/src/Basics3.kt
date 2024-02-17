fun main(){

    //in case of switch we have to use when in kotlin
    //and instead of default we should use else here
    val animal = "dog"
    when (animal){
        "horse" -> println("animal is horse")
        "cat" -> println("animal is cat")
        "dog" -> println("animal is dog")
        "tiger" -> println("animal is tiger")
        else  ->  println("animal is found")
    }

}
