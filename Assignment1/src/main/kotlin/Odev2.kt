fun main() {
    print("Boyut girin: ")
    //Girilecek boyut belirlenir
    val inputBoyut = readLine()!!
    var x = inputBoyut.toInt()
    var result: Long = 0
    //girilen boyut kadar input girilmesi istenir
    while (x > 0) {
        print("Sayı Girin: ")
        val input = readLine()!!
        result += input.toLong()
        x--
    }
    print(result.toString())
}