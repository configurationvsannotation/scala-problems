package com.sage.types

object TypeConstraints extends App{

  class A{
    type B >: List[Int] // lower bound - any parent to List can be referenced
  }
  val a = new A{
    type B = Traversable[Int]
  }
  val b = new A{
    type B = List[Int]
  }

  class C{
    type B <: Traversable[Int] // upper bound any child of Traversible can be referenced
  }

  val c = new C{
    type B = Set[Int]
  }
  val d = new C{
    type B = List[Int]
  }


}
