package com.sage.functional

object ComposingFunctions extends App{

  def partial[A,B,C](a:A,f: (A,B) => C):B=>C = {
    (b)=> f(a,b)
  }

  def curry[A,B,C](f: (A,B) => C):A => (B=>C) = {
    (a) => f(a,_)
  }



}
