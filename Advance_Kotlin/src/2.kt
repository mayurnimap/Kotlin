

// SingleTone Pattern

//usecase below

//motto of this concept is if we have made one method and that method is acccessible only with the one object then
// it will be very easy such as adding count in gmail as we know gmail is one app and we want everyone to count
//the numbers of gmail using only one object so the tally will be easy

fun main()
{
    Sharing.increase() //tw=1
    Sharing.increase() //tw=2
    Sharing.decrease() //fb=1

    Sharing.display()
}


object Sharing{

    private var twitterlikes = 0
    private var fblikes = 0

    fun increase() = twitterlikes++ // ignore this
    fun decrease() = fblikes++  //

    fun display()
    {
        println(twitterlikes)
        println(fblikes)
    }
}