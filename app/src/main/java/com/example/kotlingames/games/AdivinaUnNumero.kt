//package com.example.kotlingames.games
//
//fun main() {
//    val range = 1..10
//    val numberToGuess = range.random()
//    var attemps = 0
//    print("Bienvenido al juego Adivina un Numero")
//    println("Estoy pensando en un numero entre 1 y 10. Adivinalo")
//    println("Ingresa tu suposicion")
//    do {
//        var guess = readlnOrNull()?.toIntOrNull()
//        if(guess != null){
//            //El numero que me pasaron es valido
//            attemps++
//            when{
//                guess < numberToGuess -> println("El numero que estoy pensando es mayor")
//                guess > numberToGuess -> println("El numero que estoy pensando es menor")
//                else -> println("Felicidades, le atinaste we, lo adivinaste en $attemps intentos")
//            }
//
////            if (guess == numberToGuess){
////                println("Le atinaste we")
////            }
////            else if (guess > numberToGuess){
////                println("El numero que estoy pensando es menor")
////            }
////            else if (guess < numberToGuess){
////                println("El numero que estoy pendando es mayor")
////            }
////        }
////        else{
////            //No es numero
////            println("Porfavor ingresa un numero valido")
////        }
//        }
//   while(guess != numberToGuess){
//
//        }
//    }