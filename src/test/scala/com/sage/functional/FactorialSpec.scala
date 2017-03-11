package com.sage.functional

import org.scalatest.FlatSpec

/**
  * Created by marksage on 3/8/17.
  */
class FactorialSpec extends  FlatSpec{
  "Doing some factorials" should "return some good stuff" in {
    assert(1 == Factorial.fact(1))
    assert(2 == Factorial.fact(2))
    assert(6 == Factorial.fact(3))
    assert(24 == Factorial.fact(4))
  }

}
