package com.sage.functional

import scala.math.BigInt

/**
  * Created by marksage on 3/8/17.
  */
object Factorial {
  def fact(nthNumber:Int):Int = {
    (1 to nthNumber).fold(1)(_ * _)

  }

}
