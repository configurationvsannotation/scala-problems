package com.sage.functional

import org.scalatest.FlatSpec
import List._

class Chapter3Exercises extends FlatSpec {

  def implement (s:String)= {
    it should s
  }

  implement ("3.2 the function tail for removing the first element of a List") in {
     assert(List(2,3,4,Nil) == tail(List(1,2,3,4,Nil)))
   }
  implement ("3.3 he function setHead for replacing the first element of a List with a different value") in {
    assert(List(2,3,4,Nil) == setHead(2,List(5,3,4,Nil)))
  }
  implement ("3.4 Generalize tail to the function drop, which removes the first n elements from a list") in {
    assert(List(1,2,3,5,6,7) == drop(List(5,6,8,1,2,3,5,6,7),3))
  }
  implement ("3.5 dropWhile, which removes elements from the List prefix as long as they match a predicate.") in {
    assert(List(4,5,6,7) == dropWhile(List(1,2,3,4,5,6,7),(a:Int) => a < 4))
  }
  implement ("3.6 a function, init, that returns a List consisting of all but the last element of a List") in {
    assert(List(3,4,5) == init(List(3,4,5,6)))
  }
  "Summing the elements in an int list" should "result" in {
    assert (10 == sumLeft(List(1,2,3,4)) )
  }
  "Taking the produce of the elements in an int list" should "result" in {
    assert (24 == productLeft(List(1,2,3,4)) )
  }
  "Taking the length of the elements in an int list" should "result" in {
    assert (11 == lengthLeft(List(1,2,3,4,1,2,3,4,1,2,3) ))
  }
//  "Write a function that returns the reverse of a list given List(1,2,3) it" should "return List(3,2,1)" in {
//    assert (Cons(3,Cons(2,Cons(1,Nil))) == reverse(List(1,2,3),Nil))
//  }
  "Write a function that transforms a list of integers by adding 1 to each element. " +
    "For List(6,5,4) it" should "return List(7,6,5)" in {
    assert (List(7,6,5) == addOne(List[Int](6,5,4)))
  }
//  "Convert a List[Double] to List[String]turns each value in a List[Double] into a String. You can use the expression d.toString t" +
//    "o convert some d: Double to a String." should "result" in {
//    assert(List("1","2","3") == convert(List(1d,2d,3d)))
//  }

}
