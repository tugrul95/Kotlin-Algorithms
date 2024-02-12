package com.example.myapplication.standart_programlama

fun dikdortgenAlaniniHesapla(uzunluk: Double, genislik: Double): Double {
    return uzunluk * genislik
}

fun main() {
    val alan = dikdortgenAlaniniHesapla(5.0, 3.0)
    println("Dikdörtgenin alanı: $alan birim kare")
}