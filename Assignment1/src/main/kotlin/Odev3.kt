fun main() {
    print("Sayı Girin: ")
    val input = readLine()!!
    //input aralığı kontrolü
    if (input.toInt() in 1..18) {
        val x = firstFactorial(input.toInt())
        print(x.toString())
    }
}

private fun firstFactorial(num: Int): Int {
    var x = 1
    //verilen sayıdan 1 e kadar lan sayıların carpimi
    for (i in num downTo 1) {
        x *= i
    }
    return x;
}