const val discount:Int = 100
const val discountStart:Int = 1000

fun main() {
    print("Введите цену за музыкальный трек: ")
    val itemPrice = readLine()!!.toInt()
    print("Введите количество купленых треков: ")
    val itemCount = readLine()!!.toInt()
    print("Ведите сумму предыдущих покупок: ")
    val amountOfPreviousPurchases = readLine()!!.toInt()
    print("Введите 1 если Вы наш меломан и 0 если нет: ")
    val musicLover:Boolean = readLine()!!.toInt()==1
    val totalPrice:Int = itemPrice * itemCount
    generalDiscountCalculation(amountOfPreviousPurchases,totalPrice,musicLover)
}

fun generalDiscountCalculation (amountOfPreviousPurchases:Int, totalPriceGeneral:Int, musicLover:Boolean) {
    print("Стоимость: ${
        if ((amountOfPreviousPurchases<discountStart*10 && amountOfPreviousPurchases>discountStart) || (totalPriceGeneral<discountStart*10 && totalPriceGeneral>discountStart)) {
            melomanDiscountCalculation((totalPriceGeneral-discount),musicLover)
        } else if (amountOfPreviousPurchases>discountStart*10 || totalPriceGeneral>discountStart*10) {
            melomanDiscountCalculation(((totalPriceGeneral-totalPriceGeneral*0.05).toInt()),musicLover)
        } else melomanDiscountCalculation(totalPriceGeneral,musicLover)
    }")
}

fun melomanDiscountCalculation(totalPriceMeloman:Int, musicLover:Boolean): Int {
    return if (musicLover) {
        (totalPriceMeloman - totalPriceMeloman * 0.01).toInt()
    } else {
        totalPriceMeloman
    }
}