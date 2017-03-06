package com.sage.problems

object Fibonacci {

  def numberFor(n:Long):Long = {
    fibonacci(n)
  }
  private def fibonacci(i:Long): Long ={
    i match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(i - 1) + fibonacci(i - 2)
    }
  }

}
