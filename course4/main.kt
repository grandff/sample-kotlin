fun main() {    
    quiz1()
    quiz2()
    quiz3()
}

fun quiz1() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages >= 100){
        println("Your phone is blowing up! You have 99+ notifications.")
    }else{
        println("You have $numberOfMessages notifications.")
    }
}

fun quiz2() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    if(age < 13) {  // 12세 이하 어린이용
        return 15
    }else if(age >= 13 && age <= 60) {
        if(isMonday) 
            return 25
        else
            return 30
    }else if(age > 60 && age <= 100) {
        return 20
    }else{
        return 0
    }
}

fun quiz3() {
    printFinalTemperature(27.0, "Celsius", "Fahrenheit" ){ 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}