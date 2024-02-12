package com.example.myapplication.standart_programlama

fun icAciHesapla(kenarSayisi: Int): Double {
    return (kenarSayisi - 2) * 180.0 / kenarSayisi
}

fun main() {
    val icAci = icAciHesapla(6)
    println("Her bir iç açısı: $icAci derece")
}