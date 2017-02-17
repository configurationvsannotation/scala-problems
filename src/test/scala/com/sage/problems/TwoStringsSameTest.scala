package com.sage.problems

import org.scalatest.FlatSpec

class TwoStringsSameTest extends FlatSpec{

  "Two strings that have the same characters" should "return a true value" in {
    val same = new TwoStringsSame
    assert(same.sameCharacters("abc","cab"))
  }
  "1 or more null string" should "return a false value" in {
    val same = new TwoStringsSame
    assert(!same.sameCharacters("abc",null))
  }

}
