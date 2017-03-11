package com.sage.functional

object SortedArray {
  def isSorted[A](as:Array[A],ordered:(A,A)=>Boolean):Boolean ={
    (1 until as.length).map(i => ordered(as(i - 1),as(i))).forall(b => b)
  }
}
