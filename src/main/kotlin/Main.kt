var itemPrice:Int = 0
var itemCount:Int = 0
var amountOfPreviousPurchases = 0
const val discount:Int = 100
const val discountStart:Int = 1000
var musicLover:Boolean = false

fun main() {
    takeMyData()
    val totalPrice:Int = itemPrice * itemCount
    generalDiscountCalculation(amountOfPreviousPurchases,totalPrice,musicLover)
}

fun takeMyData() {
    print("Введите цену за музыкальный трек: ")
    itemPrice = readLine()!!.toInt()
    print("Введите количество купленых треков: ")
    itemCount = readLine()!!.toInt()
    print("Ведите сумму предыдущих покупок: ")
    amountOfPreviousPurchases = readLine()!!.toInt()
    print("Введите 1 если Вы наш меломан и 0 если нет: ")
    musicLover = if (readLine()!!.toInt()==1) {true} else {false}
}

fun generalDiscountCalculation (amountOfPreviousPurchases:Int, totalPrice:Int, musicLover:Boolean) {
    val result = if (amountOfPreviousPurchases < discountStart) {
        melomanDiscountCalculation(totalPrice,musicLover)
    } else if (amountOfPreviousPurchases < discountStart*10) {
        melomanDiscountCalculation((totalPrice - discount),musicLover)
    } else {
        melomanDiscountCalculation((totalPrice*0.05).toInt(),musicLover)
    }
    print("Стоимость: $result")
}

fun melomanDiscountCalculation(totalPrice:Int, musicLover:Boolean): Int {
    return if (musicLover) {
        (totalPrice - totalPrice * 0.01).toInt()
    } else {
        totalPrice
    }
}