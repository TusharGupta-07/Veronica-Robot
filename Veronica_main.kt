import java.text.SimpleDateFormat
import java.util.*

fun main()
{
    //Object for class Veronica
    val veronica =  Veronica()

    //parameters for Ringing The Alarm
    val currTime = 6 //At this time Alarm will ring
    val weekdayName = SimpleDateFormat("EEEE", Locale.ENGLISH).format(System.currentTimeMillis()) //This will get the Day of week
    val noAlarm = arrayListOf("Wednesday","Saturday") //On these days Alarm will not ring

    veronica.ringTheAlarm(currTime, weekdayName, noAlarm)

    //parameters for Making Coffee

    val coffeeT1 = Coffee("Black", 36)
    val coffeeT2 = Coffee("With Milk",36) //types of coffee i like

    val coffeeIngrediants = arrayListOf(coffeeT1,coffeeT2)

    veronica.makeCoffee(weekdayName,coffeeIngrediants)

    //parameters for Heat The Water
    val noBathing = arrayListOf("Wednesday","Saturday") //on these days i will not take bath
    val temperatureOfWaterInFahrenheit = 112

    veronica.heatTheWater(weekdayName, noBathing, temperatureOfWaterInFahrenheit)

    //parameters for Pack The Bag
    val mon = TimeTable("Monday", "Java", "Operating System","BEEE","Lunch Break","NA","Android Development","Machine Learning")
    val tue = TimeTable("Tuesday", "Aptitude", "NA","Java","Lunch Break","Machine Learning","Android Development", "Operating System")
    val wed = TimeTable("Wednesday", "NA", "NA","NA","NA","NA","NA", "NA")
    val thr = TimeTable("Thursday", "Operating System", "Java","Machine Learning","Lunch Break","Android Development","NA","BEEE")
    val fri = TimeTable("Friday", "Operating System", "Java","Machine Learning","Lunch Break","NA","Aptitude","BEEE")
    val sat = TimeTable("Saturday", "NA", "NA","NA","NA","NA","NA","NA")
    val sun = TimeTable("Sunday", "Java", "NA","Machine Learning","Lunch Break","Android Development","Operating System","NA")

    val timeTable = arrayListOf(mon,tue,wed,thr,fri,sat,sun)

    veronica.packYourBag(timeTable)


    //parameters for Cook Breakfast and Lunch
    val breakFast = arrayListOf("Bread Butter","Corn Flakes","Boiled Eggs","Omlet","Sprouts")
    val lunch = arrayListOf("Egg and Avocado Sandwich","Salad with Chicken, Cheese, Carrots, Hummus","Chopped Quinoa Salad with Cranberries","Stuffed Ranchero Sweet Potato.","Crunchy Peanut Butter Wrap.")

    veronica.cookBeakFastAndLunch(breakFast,lunch)

    //parameters for Iron The Clothes
    val clothes1 = Clothes("Formal Shirt", "Trouser")
    val clothes2 = Clothes("T-Shirt", "Trouser")
    val clothes3 = Clothes("T-Shirt", "Jeans")
    val clothes4 = Clothes("Casual Shirt", "Chinos")

    val clothesTypes = arrayListOf(clothes1,clothes2,clothes3,clothes4)
    veronica.ironTheClothes(clothesTypes)

}




