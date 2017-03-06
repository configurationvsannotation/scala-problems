package com.sage.collections.iterable

object IterableExample extends App{

  val iterable = Iterable(1,5,67)
  val ints = iterable.iterator
  while(ints.hasNext){
    println(s"next: ${ints.next()}")
  }

  for(x <- iterable){
    println(s"for comprehension: $x")
  }

  iterable.foreach(i => s"each: $i") // doesn't work for Iterable



}
