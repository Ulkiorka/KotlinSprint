package org.example.lesson_9
fun main(){
    val listeDeProduites = listOf(2, 50, 15)
    print("Введите количество порций: ")
    val amount = readln().toInt()

    val listeToutesPortions = listeDeProduites.map {
        it*amount
    }

    println("“На $amount порций вам понадобится: Яиц – ${listeToutesPortions[0]}," +
            " молока – ${listeToutesPortions[1]}," +
            " сливочного масла – ${listeToutesPortions[2]}”.")
}

