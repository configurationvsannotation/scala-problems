package com.sage.functional

import scala.annotation.tailrec


sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head:A, tail:List[A]) extends List[A]

object List{
  def sum(ints:List[Int]):Int = ints match{
    case Nil => 0
    case Cons(head, tail) => head + sum(tail)
  }
  def product(ds:List[Double]):Double = ds match {
    case Nil => 1
    case Cons(head, tail) => head * product(tail)
  }
  def foldRight[A,B](l:List[A], b:B)(f:(A, B) => B):B = l match {
    case Nil => b
    case Cons(head, tail) => f(head, foldRight(tail,b)(f))
  }


  def foldRightTr[A,B](l:List[A], onNil:B)(f:(A, B) => B):B = {
    @tailrec
    def loop(l:List[A], acc:B):B = l match {
      case Nil => acc
      case Cons(head, tail)=> {
        loop(tail,f(head, acc))
      }
    }
    loop(l,onNil)
  }
  @tailrec
  def foldLeft[A,B](as: List[A], z: B)(f: (B, A) => B): B = as match {
    case Nil => z
    case Cons(x, xs) => foldLeft(xs,f(z,x))(f)

  }

  def sumLeft(ints:List[Int]):Int = {
    foldLeft(ints,0)(_ + _)
  }
  def productLeft(ints:List[Int]):Int = {
    foldLeft(ints,1)(_ * _)
  }
  def lengthLeft(ints:List[Int]):Int = {
    foldLeft(ints,0)((a,b) => a + 1)
  }
  def apply[A](as:A*):List[A] ={
    if(as.isEmpty)Nil
    else Cons(as.head,apply(as.tail: _*))
  }
  def tail[A](list:List[A]) = list match {
    case Nil => Nil
    case Cons(_, tail) => tail
  }
  def setHead[A](head:A, list:List[A]):List[A] = {
    Cons(head,tail(list))
  }
  def drop[A](l: List[A], n: Int): List[A] =  l match {
    case Nil => Nil
    case Cons(x, xs) if n > 0 => drop(xs, n-1)
    case _ => l
  }
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case Cons(head,tail) if f(head) => dropWhile(tail,f)
    case _ => l
  }
  def dropWhileWithTypeInference[A](l: List[A])( f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case Cons(head,tail) if f(head) => dropWhile(tail,f)
    case _ => l
  }
  def length[A](as: List[A]): Int = {
    foldRight(as,0)((_,b) => b + 1)
  }
  def reverse[A,B](as:List[A],b:List[A]) = as match {
    case Nil => b
    case Cons(h, t) => {
      foldRight[A,List[A]](t,Cons(h,Nil))((a, b) => Cons[A](a, t))
    }
  }


  def addOne(l: List[Int]): List[Int] = {
    foldRight(l, Nil:List[Int])((h,t) => Cons(h+1,t))
  }

  def convert(l:List[Double]):List[String] =  {
   foldRight(l, Nil:List[String])((h,t) => Cons(h.toString,t))
  }

  def init[A](l:List[A]):List[A] = l match{
    case Nil => Nil
    case Cons(head,tail) if head != Nil && tail == Nil => Nil
    case Cons(head,tail) if head != Nil => Cons(head, init(tail))

  }

  // all but last
//  def init[A](l: List[A]): List[A] = {
//    @tailrec def findCount(l:List[A], count:Int):Int = {
//     l match {
//       case Nil => count
//       case Cons(head,tail) => findCount(tail, count + 1)
//     }
//      val cnt: Int = findCount(l,0)
//      var result: List[A] = Nil
//      (0 until(cnt)).foreach(result = )
//   }
//  }

 }
object Runner extends App{
  import List._
  val x:List[Double] = List(1l,2l,3l)
  println(length(x))
  println("right: " + foldRight(x,1d)( _ / _))
  println("left: " + foldLeft(x,1d)( _ / _))

}


