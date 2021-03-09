fun main() {
    val itemPrice:Int = 100
    val itemCount:Int = 11
    val discount:Int = 100
    val discountStart:Int = 1000
    val musicLover:Boolean = true
    var totalPrice:Int = itemPrice * itemCount
    val result = if (musicLover) {
        val melomanPrice = totalPrice - totalPrice*0.05
        melomanPrice - melomanPrice*0.01
        } else if (totalPrice > discountStart) totalPrice - discount else totalPrice
    print("Стоимость: $result")
}