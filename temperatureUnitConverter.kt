/*
    Author: Aleksandar Arsic
    Contact email: srpskaitucionica@gmail.com
    Github: https://github.com/SrpskaITucionica
 */

/*
    Unit values are (string):
    C - celsius
    K - kelvin
    F - Fahrenheit
 */

fun main() {
    // Examples
    println(temepratureUnitConverter(23.0, 'C', 'K'))
    println(temepratureUnitConverter(150.0, 'F', 'C'))
}

fun temepratureUnitConverter(amount: Double, unit1: Char, unit2: Char): String {
    var result = 0.0
    var text = ""

    if (unit1 == 'C' && unit2 == 'K') {
        result = amount + 273.15
        text = "$amount Celsius is equal to $result Kelvin"
    }
    else if (unit1 == 'C' && unit2 == 'F') {
        result = 9.0 / 5.0 * amount + 32.0
        text = "$amount Celsius is equal to $result Fahrenheit"
    }

    if (unit1 == 'K' && unit2 == 'C') {
        result = amount - 273.15
        text = "$amount Kelvin is equal to $result Celsius"
    }
    else if(unit1 == 'K' && unit2 == 'F') {
        result = 9.0 / 5.0 * (amount - 273.15) + 32
        text = "$amount Kelvin is equal to $result Fahrenheit"
    }

    if(unit1 == 'F' && unit2 == 'C') {
        result = 5.0 / 9.0 * (amount - 32.0)
        text = "$amount Fahrenheit is equal to $result Celsius"
    }
    else if(unit1 == 'F' && unit2 == 'K') {
        result = 5.0 / 9.0 * (amount - 32.0) + 273.15
        text = "$amount Fahrenheit is equal to $result Kelvin"
    }

    return text
}
