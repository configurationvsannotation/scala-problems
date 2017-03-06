package com.sage.types

object Paths extends App{
  class Outer{
    trait Inner

    def y = new Inner{}
    def foo(x:this.Inner) = null
    def bar(x:Outer#Inner) = null
  }

  val x = new Outer
  val y = new Outer

  x.foo(x.y)
  //x.foo(y.y) // won't compile
  x.bar(y.y)

}
