package com.example.list3
class Fraction{
    var numerator: Int = 0
    var denominator: Int = 1

    constructor(m: Int){
        this.numerator = m
        this.denominator = 1
    }
    constructor(numerator: Int, denominator: Int){
        this.numerator = numerator
        this.denominator = denominator
    }
    fun reduce(): Fraction{
        val a = this.greatestCommonDivisor() //OH! Initially I had LITERALLY the same code in greatestCommonDivisor() and reduce() functions
        return(Fraction(this.numerator/a, this.denominator/a))
    }
    fun greatestCommonDivisor(): Int{
        var a = this.numerator
        var b = this.denominator
        while (b != 0){ //this algorithm is pulled from matemaks and translated to Kotlin by me
            val t = b
            b = a % b
            a = t
        }
        return a
    }
    fun quot(f1:Fraction): Fraction{
        return Fraction(f1.numerator*this.denominator, f1.denominator*this.numerator)
    }
    fun fractionToString(): String{
        return "$numerator/$denominator"
    }
}
fun main(){
    val f1 = Fraction(2, 4)
    val f2 = Fraction(3)
    val f3 = Fraction(30, 45)
    println("f1 = ${f1.fractionToString()}")
    println("f2 = ${f2.fractionToString()}")
    println("f3 = ${f3.fractionToString()}")
    println("f1 * f2 = ${f1.quot(f2).fractionToString()} = ${f1.quot(f2).reduce().fractionToString()}")
    println("f3 reduced = ${f3.reduce().fractionToString()}")
    println("Biggest common divisor of f3 = ${f3.greatestCommonDivisor()}")
}
