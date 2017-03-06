package com.sage.problems

import org.scalatest.FlatSpec

class BitSpec extends FlatSpec{
  val a = 60
  val b = 13
  "Performing an and (&) against 00111100 and 00001101" should "result" in {
    assert((a & b) == 12)
    assert("1100" == Integer.toBinaryString(12))
  }
  "Performing an or (|) against 00111100 and 00001101" should "result" in {
    assert((a | b) == 61)
    assert("111101" == Integer.toBinaryString(61))
  }
  "Performing an XOR (^ - bit set in one but not both) against 00111100 and 00001101" should "result" in {
    assert((a ^ b) == 49)
    assert("110001" == Integer.toBinaryString(49))
  }
  "Performing an complement (~ - flip bits) against 00111100" should "result" in {
    assert((~a) == -61.toByte)
    assert("11000011" == Integer.toBinaryString(-61).takeRight(8))
  }
  "Performing an left shift of 2 (<<) against 00111100" should "result" in {
    assert((a << 2) == 240)
    assert("11110000" == Integer.toBinaryString(240))
  }
  "Performing an right shift of 2 (>>) against 00111100" should "result" in {
    assert((a >> 2) == 15)
    assert("1111" == Integer.toBinaryString(15))
  }
  "Examples of bit shifts" should "do the right thing" in {
    var a = 60           /* 60 = 0011 1100 */
    var b = 13           /* 13 = 0000 1101 */
    var c = 0

    c = a & b            /* 12 = 0000 1100 */
    println("60 & 13 = " + c )
    assert(c == 12)
    c = a | b            /* 61 = 0011 1101 */
    println("60 | 13 = " + c )

    c = a ^ b            /* 49 = 0011 0001 */
    println("60 ^ 13 = " + c )

    c = ~a               /* -61 = 1100 0011 */
    println("~60 = " + c )

    c = a << 2           /* 240 = 1111 0000 */
    println("60 << 2 = " + c )

    c = a >> 2           /* 215 = 1111 */
    println("60 >> 2  = " + c )

    c = a >>> 2          /* 215 = 0000 1111 */
    println("60 >>> 2 = " + c )
  }

}
