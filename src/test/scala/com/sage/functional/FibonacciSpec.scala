package com.sage.functional

import org.scalatest.FlatSpec


class FibonacciSpec extends FlatSpec{

  "Getting the 'nth' fibonacci number" should "return the correct result" in {
    assert(0 == Fibonacci.fib(0))
    assert(1 == Fibonacci.fib(1))
    assert(1 == Fibonacci.fib(2))
    assert(2 == Fibonacci.fib(3))
    assert(3 == Fibonacci.fib(4))
    assert(5 == Fibonacci.fib(5))
    assert(8 == Fibonacci.fib(6))

    assert(13 == Fibonacci.fib(7))
  }

}
