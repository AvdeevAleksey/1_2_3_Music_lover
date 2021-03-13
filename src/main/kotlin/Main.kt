var itemPrice:Int = 0
var itemCount:Int = 0
var musicLover:Boolean = false
fun main() {
    val discount:Int = 100
    val discountStart:Int = 1000
    takeMyData()
    var totalPrice:Int = itemPrice * itemCount
    val result = if (musicLover) {
        val melomanPrice = totalPrice - totalPrice*0.05
        melomanPrice - melomanPrice*0.01
        } else if (totalPrice > discountStart) totalPrice - discount else totalPrice
    print("Стоимость: $result")
}

fun takeMyData() {
    print("Введите цену за музыкальный трек: ")
    itemPrice = readLine()!!.toInt()
    print("Введите сумму предыдущих покупок: ")
    itemCount = readLine()!!.toInt()/itemPrice
    print("Введите 1 если Вы наш меломан и 0 если нет: ")
    musicLover = if (readLine()!!.toInt()==1) {true} else {false}
}