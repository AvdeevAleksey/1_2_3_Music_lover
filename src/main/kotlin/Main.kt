var itemPrice:Int = 0
var itemCount:Int = 0
const val discount:Int = 100
const val discountStart:Int = 1000
var musicLover:Boolean = false
fun main() {
    takeMyData()
    var totalPrice:Int = itemPrice * itemCount
    burnIt(itemPrice,totalPrice,musicLover)
}

fun takeMyData() {
    print("Введите цену за музыкальный трек: ")
    itemPrice = readLine()!!.toInt()
    print("Введите количество купленых треков: ")
    itemCount = readLine()!!.toInt()
    print("Введите 1 если Вы наш меломан и 0 если нет: ")
    musicLover = if (readLine()!!.toInt()==1) {true} else {false}
}

fun burnIt (itemPrice:Int, totalPrice:Int, musicLover:Boolean) {
    val result = if (musicLover) {
        val melomanPrice = totalPrice - totalPrice*0.05
        melomanPrice - melomanPrice*0.01
    } else if (totalPrice > discountStart) totalPrice - discount else totalPrice
    print("Стоимость: $result")
}