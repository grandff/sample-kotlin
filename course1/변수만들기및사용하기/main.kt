fun main() {
    val count: Int = 2  // 이름 : data type = initial value 순서대로 선언
    var count2 = 3  // 값을 할당하면 data type을 선언안해도 됨
    println(count)
    println(count2)


    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")    // 값 연산 후 출력

    // 변수 값을 업데이트 해야한다면 val 대신 var를 사용해야함
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")
}