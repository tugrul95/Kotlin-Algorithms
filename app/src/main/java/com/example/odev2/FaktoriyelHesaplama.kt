package com.example.myapplication.standart_programlama

fun faktoriyelHesapla(sayi: Int): Long {
    var faktoriyel: Long = 1
    for (i in 1..sayi) {
        faktoriyel *= i.toLong()
    }
    return faktoriyel
}

fun main() {
    val faktoriyel = faktoriyelHesapla(5)
    println("Faktöriyeli: $faktoriyel")
}