package com.example.myapplication.standart_programlama

fun maasHesapla(gunSayisi: Int): Double {
    val calismaSaati = gunSayisi * 8
    val mesaiSaati = if (calismaSaati > 150) calismaSaati - 150 else 0
    val normalMaas = calismaSaati * 40
    val mesaiMaasi = mesaiSaati * 80
    val toplamMaas = normalMaas + mesaiMaasi
    return toplamMaas.toDouble()
}

fun main() {
    val maas = maasHesapla(30)
    println("Maaş: $maas TL")
}