const val MIN_COMMISSION = 3500.0
const val COMMISSION = 0.0075

fun main() {
    print("Введите сумму перевода (в рублях) : ")
    val amount = readLine()?.toInt()?.times(100)
    val finalCommission = if (amount!! > MIN_COMMISSION && amount * COMMISSION > MIN_COMMISSION) amount * COMMISSION else MIN_COMMISSION
    print("Будет зачислено: ${(amount / 100) - (finalCommission / 100)} \nКомиссия: ${finalCommission / 100}")

}
