package com.example.myapplication.standart_programlama

fun otoparkUcretiHesapla(sure: Int): Int {
    val ilkSaatUcreti = 50
    val ilkSaatUcretiSonrasindaSaatUcreti = 10
    val ucret = if (sure <= 1) {
        sure * ilkSaatUcreti
    } else {
        ilkSaatUcreti + (sure - 1) * ilkSaatUcretiSonrasindaSaatUcreti
    }
    return ucret
}

fun main() {
    val ucret = otoparkUcretiHesapla(3)
    println("Otopark ücreti: $ucret TL")
}