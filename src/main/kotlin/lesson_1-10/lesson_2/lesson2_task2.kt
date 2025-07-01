package org.example.`lesson_1-10`.lesson_2

fun main(){
    val permanentEmployees = 50
    val permanentSalary = 30000
    val interns = 30
    val internSalary = 20000

    val permanentExpenses = permanentEmployees * permanentSalary
    val internExpenses = interns * internSalary
    val totalExpenses = permanentExpenses + internExpenses
    val averageSalary = totalExpenses / (permanentEmployees + interns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $permanentExpenses рублей")
    println("Общие расходы по ЗП после прихода стажеров: $totalExpenses рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary рублей")
}