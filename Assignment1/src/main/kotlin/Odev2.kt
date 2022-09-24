import java.util.*

fun main() {
    print("Boyut girin: ")
    //Girilecek boyut belirlenir
    val inputBoyut = readLine()!!
    var x = inputBoyut.toInt()
    var result: Long = 0
    //girilen boyut kadar input girilmesi istenir
    val input = Scanner(System.`in`)
    print("Sayıları Aralıklı Olarak Girin: ")
    while (x > 0) {

        result += input.nextLong()
        x--
    }
    print(result.toString())
}