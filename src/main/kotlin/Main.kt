fun main() {
    try {
        print("შეიყვანეთ x-ის მნიშვნელობა: ")
        val x: Double = readln().toDouble()
        print("შეიყვანეთ y-ის მნიშვნელობა: ")
        val y: Double = readln().toDouble()
        val z: Double = x + y
        println("x და y ჯამი არის $z")
        checkRestart()
    }catch (e: NumberFormatException){
        println("შეიყვანეთ რიცხვები")
        main()
    }



}

fun checkRestart(question: String = "") {
    println(question)
    print("გსურთ პროგრამის ხელახლა დაწყება დიახ თუ არა?")
    val answer: String = readln()
    when (answer) {
        "დიახ", "yes", "Y", "diax" -> main()
        "არა", "no", "N", "ara" -> {}
        else -> checkRestart("პასუხი არავალიდურია, გთხოვთ სცადოთ ხელახლა!")
    }
}