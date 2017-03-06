package com.sage.implicits

import com.sage.models.Matrix
import org.scalatest.FlatSpec

class MatrixUtilsSpec extends FlatSpec{
  "Matrix multipliation" should "do use the SameThreadStrategy when it is available implicitly" in {
    implicit val strategy = SameThreadStrategy
    val m1 = new Matrix(Array(Array(4,8),Array(0,2),Array(1,6)))
    val m2 = new Matrix(Array(Array(5,2),Array(9,4)))
    val result = MatrixUtils.multiply(m1,m2)
    val expected = Array(Array(92d,40d),Array(18d,8d),Array(59d,26d))
    assert(expected.deep == result.repr.deep)
  }
  "Matrix multipliation" should "do use the ThreadPoolStrategy when it is available implicitly" in {
    implicit val strategy = ThreadPoolStrategy
    val m1 = new Matrix(Array(Array(4,8),Array(0,2),Array(1,6)))
    val m2 = new Matrix(Array(Array(5,2),Array(9,4)))
    val result = MatrixUtils.multiply(m1,m2)
    val expected = Array(Array(92d,40d),Array(18d,8d),Array(59d,26d))
    assert(expected.deep == result.repr.deep)
  }

}
