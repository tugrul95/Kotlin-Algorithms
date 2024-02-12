package com.example.myapplication.standart_programlama


fun eHarfiSayisiHesapla(kelime: String): Int {
    var eHarfiSayisi = 0
    for (harf in kelime) {
        if (harf == 'e' || harf == 'E') {
            eHarfiSayisi++
        }
    }
    return eHarfiSayisi
}

fun main() {
    val eHarfiSayisi = eHarfiSayisiHesapla("kelime")
    println("'e' harfi sayısı: $eHarfiSayisi")
}
