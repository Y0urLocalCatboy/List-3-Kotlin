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
        var a = this.numerator
        var b = this.denominator
        while (b != 0){
            val t = b
            b = a % b
            a = t
        }
        return(Fraction(this.numerator, this.denominator))
    }
    fun greatestCommonDivisor(): Int{
        var a = this.numerator
        var b = this.denominator
        while (b != 0){
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
    val f1 = Fraction(3, 5)
    val f2 = Fraction(3)
    val f3 = Fraction(4, 5)
    println(f1.reduce().fractionToString())
    println(f1.greatestCommonDivisor())
    println(f2.fractionToString())
    println(f3.fractionToString())
    println(f1.quot(f2).fractionToString())
}
