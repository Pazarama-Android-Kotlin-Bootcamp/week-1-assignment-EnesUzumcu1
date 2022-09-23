fun main() {
    print("Değer Girin: ")
    val input = readLine()!!
    val x = questionsMarks(input)
    print(x.toString())
}

private fun questionsMarks(str: String): String {
    //soru işareti sayısı toplam ve son sayı sıfır olarak ayarlandı
    var countMarks = 0;
    var sum = 0;
    var lastNum = 0;
    str.forEach {
        //eğer char 1-9 arasıysa mevcut degerle son rakam toplanır
        if (it in '1'..'9') {
            val digit = Integer.valueOf(it.toString())
            sum = digit + lastNum
            lastNum = digit

            //10'a eşit değilse soru işareti sıfırlanır
            if (sum != 10) {
                countMarks = 0
            }
            //char soru işaretiyse değeri arttırılır.
        } else if (it == '?') {
            countMarks++
        }
    }
    //soru işareti sayısı istenilen değerse true değilse false döndürülür.
    var result = if (countMarks == 3)
        "true"
    else
        "false"
    countMarks = 0
    return result
}
