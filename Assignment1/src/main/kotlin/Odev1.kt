fun main() {
    print("Değer Girin: ")
    val input = readLine()!!
    val x = checkStr(input)
    print(x.toString())
}

fun checkStr(input: String): Boolean {
    //4 ile 25 karakter arası kontrolu
    var check = input.length in 4..25
    //ilk karakter harf kontrolü
    check = check && input[0] in 'a'..'z' || input[0] in 'A'..'Z'
    //harf sayı ve alt çizgi içerme kontrolü
    input.forEach {
        check = check && (it in 'a'..'z' || it in 'A'..'Z' || it in '0'..'9' || it == '_')
    }
    return check
}