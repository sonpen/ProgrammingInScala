package com.sonpen.example1

import org.scalatest.FunSuite

/**
  * Created by 1109806 on 2020-09-14.
  */
class RationalTest extends FunSuite {

  test("Rational test") {
    val rational1 = new Rational(2,4)
    println(rational1.toString())

    val rational2 = new Rational(1,4)
    assert(rational1 + rational2 == new Rational(3,4))
    assert(rational1 - rational2 == new Rational(1,4))
    assert(rational1 * rational2 == new Rational(1,8))
    assert(rational1 / rational2 == new Rational(2,1))

  }

}
