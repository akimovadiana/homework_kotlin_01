package com.example.homework_kotlin_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_kotlin_1.country.City
import com.example.homework_kotlin_1.country.Country
import com.example.homework_kotlin_1.country.District
import com.example.homework_kotlin_1.country.Region

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newCities = City(listOf("Minsk", "Brest", "Vitebsk", "Gomel", "Grodno", "Mogilev"),"Minsk")
        val newRegions = Region(listOf("Minsk region", "Brest region", "Vitebsk region", "Gomel region", "Grodno region", "Mogilev region"))
        val  newDistricts = District(listOf("Minsk district", "Brest district", "Vitebsk district", "Gomel district", "Grodno district", "Mogilev district"), 118)
        val newCountry = Country("Belarus", newCities, newRegions, newDistricts, 207600)

        println(newCountry.information())
    }
}