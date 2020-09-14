package com.sonpen.example1

/**
  * Created by 1109806 on 2020-09-14.
  */
class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n, d)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational) : Rational = {
    new Rational(this.numer * that.denom + this.denom * that.numer, this.denom * that.denom)
  }
  def + (i: Int) : Rational = {
    new Rational(this.numer + i * this.denom, this.denom)
  }

  def - (that: Rational) : Rational = {
    new Rational(this.numer * that.denom - this.denom * that.numer, this.denom * that.denom)
  }
  def - (i: Int) : Rational = {
    new Rational(this.numer - i * this.denom, this.denom)
  }

  def * (that: Rational) : Rational = {
    new Rational(this.numer * that.numer,  this.denom * that.denom)
  }
  def * (i: Int) : Rational = {
    new Rational(this.numer * i, this.denom)
  }

  def / (that: Rational) : Rational = {
    new Rational(this.numer * that.denom,  this.denom * that.numer)
  }
  def / (i: Int) : Rational = {
    new Rational(this.numer, this.denom * i)
  }

  override
  def toString() : String = {
    numer + "/" + denom
  }

  def == (that: Rational) : Boolean = {
    if( this.numer == that.numer && this.denom == that.denom) true else false
  }

  private def gcd(a: Int, b: Int) : Int = {
    if( a == 0 ) return b else gcd(a%b, a)
  }

}
