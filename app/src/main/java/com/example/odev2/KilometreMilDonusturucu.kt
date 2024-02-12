package com.example.myapplication.standart_programlama

fun kilometreyiMileDonustur(kilometre: Double): Double {
    val birKilometreMileEsitMi = 0.621
    return kilometre * birKilometreMileEsitMi
}

fun main() {
    val mile = kilometreyiMileDonustur(10.0)
    println("$mile mil eder.")
}

