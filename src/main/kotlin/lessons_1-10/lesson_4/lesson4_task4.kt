package org.example.`lesson_1-10`.lesson_4
fun main(){
    var trainingDay = 5
    val isOddDay = trainingDay % 2 != 0
    println("""
        Упражнения для рук:    $isOddDay
        Упражнения для ног:    ${!isOddDay}
        Упражнения для спины:  ${!isOddDay}
        Упражнения для пресса: $isOddDay
    """.trimIndent())
}