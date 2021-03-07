import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

//name of the Robot is Veronica
class Veronica
{
    fun ringTheAlarm(currTime : Int, weekdayName : String,  noAlarm : ArrayList<String>)
    {
        if(weekdayName == noAlarm[0] || weekdayName == noAlarm[1])
        {
            println("Today is $weekdayName . So, there is No Alarm for Today\nEnjoy your Sleep")
        }
        else
        {
            println("Wake up ! Wake up ! Wake up ! it's a brand-new day, Good Morning Sir\n" +
                    "Today is $weekdayName | Time is ${currTime}.00 AM\n" +
                    "Alarm is ringing And, your Coffee is being Prepared.")
        }
        println("-------------------------------------------------------------------------------------------------")
    }

    fun makeCoffee(weekdayName: String, coffeeIngrediants: ArrayList<Coffee>) {

        if(weekdayName == "Wednesday" || weekdayName == "Saturday")
        {
            println("Today is $weekdayName. So, Coffee is being Prepared, with followed Ingredients ${coffeeIngrediants[1]}.")
        }
        else
        {
            println("Today is $weekdayName. So, Coffee is being Prepared, with followed Ingredients ${coffeeIngrediants[0]}.")
        }
        println("-------------------------------------------------------------------------------------------------")

    }

    fun heatTheWater(weekdayName: String, noBathing: ArrayList<String>, temperatureOfWater_inFahrenheit: Int)
    {
        println("GOOD MORNING, SIR...!!!")
        if(weekdayName == noBathing[0] || weekdayName == noBathing[1])
        {
            println("So, its $weekdayName and you are Not Taking Bath Today HMM...!!!, i suggest you that you should take bath everyday")
        }
        else
        {
            println("Water is being heated on temperature $temperatureOfWater_inFahrenheit degree Fahrenheit or 44.4 degree Celsius")
        }
        println("-------------------------------------------------------------------------------------------------")
    }

    fun packYourBag(timeTable: ArrayList<TimeTable>)
    {
        val weekdayName = SimpleDateFormat("EEEE", Locale.ENGLISH).format(System.currentTimeMillis())
        println("Hey Sir, are you ready for your Classes, I have packed your bag with Books for the following Time Table :")
        when(weekdayName)
        {
            "Monday" -> println(timeTable[0])
            "Tuesday" -> println(timeTable[1])
            "Wednesday" -> println(timeTable[2])
            "Thursday" -> println(timeTable[3])
            "Friday" -> println(timeTable[4])
            "Saturday" -> println(timeTable[5])
            "Sunday" -> println(timeTable[6])
        }
        println("-------------------------------------------------------------------------------------------------")
    }

    fun cookBeakFastAndLunch(breakFast: ArrayList<String>, lunch: ArrayList<String>)
    {
        //val randomBreakFast = (breakFast).random()
        //val randomLunch = (lunch).random()
        println("So, Today I am preparing '${(breakFast).random()}' for your BreakFast, hope you love it...!")
        println("And, i will prepare '${(lunch).random()}' for your Lunch, hope you also love it...!")
        println("-------------------------------------------------------------------------------------------------")
    }

    fun ironTheClothes(clothesTypes: ArrayList<Clothes>)
    {
        var x  = 0
        for(i in clothesTypes)
        {
            println("$x : $i")
            x++
        }
        println("What you want to wear, Choose from Options 0,1,2 and 3.")
        val userInput = readLine()!!.toInt()
        if(x>=0 || x<=3) {
            println("HMM ${clothesTypes[userInput]}, Great choice. Okay, you take a bath and I will make\nsure that your clothes will be Ironed.")
        }
        else
        {
            println("Please Choose the Correct Option...!")
        }
        println("-------------------------------------------------------------------------------------------------")

    }

}