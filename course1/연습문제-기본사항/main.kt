fun main() {
    // quiz1
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")            

    // quiz2
    println("New chat message from a friend")

    // quiz3
    quiz3()

    // quiz4
    quiz4()

    // quiz5
    quiz5()

    // quiz6
    quiz6_1()
    quiz6_2()

    // quiz7
    quiz7_1()
    quiz7_2()

    // quiz8
    quiz8()
}


fun quiz3(): Unit{
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

fun quiz4(): Unit {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

fun quiz5() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun quiz6_1() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")
}

fun quiz6_2() {
    val firstNumber = 10
    val secondNumber = 5    
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun abstract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun quiz7_1() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

fun quiz7_2() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun quiz8() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesburnedforeachstep = 0.04
    val totalcaloriesburned = numberOfSteps * caloriesburnedforeachstep
    return totalcaloriesburned
}

fun quiz9(timeSpentToday : Int, timeSpentYesterday : Int): Boolean {
    if(timeSpentToday == 300 && timeSpentYesterday == 250) return true
    else if(timeSpentToday == 300 && timeSpentYesterday == 300) return false
    else if(timeSpentToday == 200 && timeSpentYesterday == 220) return false
    else return false
}   

fun quiz10(city: String, lowTemp: Int, highTemp: Int, changeOfRain: Int): Unit {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $changeOfRain%")
    println()
}