package com.example.homework_kotlin_1.country

class Country (val countryName: String, val city: City, val region: Region, val district: District, val area: Int) {

    fun information() {
        println("${city.capitalName} is the capital of $countryName. " +
                "There are ${region.region.size} regions: ${region.region}, where the biggest cities are ${city.city} respectively. " +
                "Also there are ${district.totalNumber} districts in $countryName, the largest of them are: ${district.district}. " +
                "The area of $countryName is $area km².")
    }
}
