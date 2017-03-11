package com.sage.functional

import scala.annotation.tailrec

/**
  * Created by marksage on 3/8/17.
  */
object Fibonacci extends App{
 // 0,\;1,\;1,\;2,\;3,\;5,\;8,\;13,\;21,\;34,\;55,\;89,\;144,\;\ldots \;.[3]
 def fib(x: Int): Int = {
   @tailrec
  def fibHelper(x:Int, prev:Int = 0, next:Int = 1):Int ={
    x match {
      case 0 => prev
      case 1 => next
      case x => fibHelper(x - 1, next, next + prev)
    }
  }
   fibHelper(x)
 }

  println(fib(1))
  println(fib(2))
  println(fib(3))
  println(fib(4))
  println(fib(5))
  println(fib(6))

}
