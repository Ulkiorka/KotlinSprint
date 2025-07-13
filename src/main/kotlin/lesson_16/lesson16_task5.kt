package org.example.lesson_16

fun main() {
    val player = Player("Боец")
    while (player.isPlayerAlive()) {
        println("\nНовый раунд:")
        player.showStats()
        player.dealDamage()
        player.takeDamage((20..30).random())
        player.heal((5..10).random())
    }
}

class Player(
    val name: String,
) {
    private var healthPoints = 100
    private val hitForce = 15
    private var isAlive = true

    fun showStats() {
        println("У игрока [$name]: $healthPoints очков здоровья")
    }

    fun dealDamage() {
        if (isAlive)
            println("[$name] наносит противнику $hitForce очков урона")
    }

    fun takeDamage(damage: Int) {
        println("Противник наносит игроку $damage очков урона")
        healthPoints -= damage
        checkingIsDead()
    }

    fun heal(healPoints: Int) {
        if (isAlive) {
            healthPoints += healPoints
            println("[$name] вылечился на $healPoints очков здоровья")
        }
    }

    private fun checkingIsDead(){
        if (healthPoints <= 0) {
            isAlive = false
            println("$name убит")
        }
    }

    fun isPlayerAlive(): Boolean {
        return isAlive
    }
}