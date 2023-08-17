fun main() {
    birthdayGreeting()
    val result = birthdayGreeting2()
    println(result)

    val result2 = birthdayGreeting3("Kill dong")
    println(result2)

    val result3 = birthdayGreeting4(name= "Kill dong",age= 5)   // 매개변수에 이름을 지정해서 호출 가능
    println(result3)

    val result4 = birthdayGreeting5(age= 5)   // 기본값이 설정된 매개변수는 생략 가능
    println(result4)
}

fun birthdayGreeting(): Unit {      // 값을 반환하지 않는다면 Unit이 됨
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreeting2(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting3(name: String): String {   // 매개변수를 변경할 수 없음!! 주의할것
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting4(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting5(name: String = "Rover", age: Int): String {   // 기본값 설정 가능
    return "Happy Birthday, $name! You are now $age years old!"
}