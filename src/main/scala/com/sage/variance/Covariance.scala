package com.sage.variance

object Covariance extends App{

  class T[+A]{}
  val x = new T[AnyRef]
  val y:T[Any] = x // Any is the parent of AnyRef
  //val z:T[String] = x // won' compile String t

  val a = new T[String]
  val b:T[AnyRef] = a
  val c:T[Any] = a


}
