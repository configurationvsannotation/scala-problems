package com.sage.problems

import org.scalatest.FlatSpec

class FibonacciSpec extends FlatSpec{

  "Finding the 8th Fibonacci number" should "result in the correct answer" in {
    assert(Fibonacci.numberFor(8) == 21)
  }

}
