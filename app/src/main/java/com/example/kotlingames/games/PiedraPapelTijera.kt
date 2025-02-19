package com.example.kotlingames.games

/* El programa solicitara al jugador que ingrese un numero a su eleccion
    1. Para Piedra
    2. Para Papel
    3. Para Tijera

    El programa mostrara la eleccion de la computadora

    Las Reglas
    Piedra vence a Tijera
    Tijera vence a Papel
    Papel venve a Piedra

    Se debe determinar al ganador del juego

    El programa debe manejar entradas invalidas o numeros fuera del rango especificado

*/

fun main(){
    println("Porfis ingresa un numero del 1 al 3, donde (1.Piedra\n 2.Tijera\n 3.Papel\n)")
    var choiceInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiceInput != null && choiceInput in 1..3

    while(!isValidInput){
        println("Entrada no valida, porfavor ingresa los numero 1, 2, 3")
        choiceInput = readlnOrNull()?.toIntOrNull()
        isValidInput = choiceInput != null && choiceInput in 1..3
    }
    println("Juego se ejecuto")
    val computerChoice = (1..3).random()
    val computerChoiceString = when {
        computerChoice == 1 -> "Piedra"
        computerChoice == 2 -> "Tijera"
        computerChoice == 3 -> "Papel"
        else -> "Sin eleccion"
    }
    println("La computadora selecciono $computerChoiceString")
    val winner = when{
        choiceInput == computerChoice -> "Empate"
        choiceInput == 1 && computerChoice == 2 -> "Ganaste"
        choiceInput == 2 && computerChoice == 3 -> "Ganaste"
        choiceInput == 3 && computerChoice == 1 -> "Ganaste"
        else -> "La computadora"
    }
    println("El ganador es: $winner")
}