package com.sage.functional.option

trait Option [+A]{
  def map[B](f:A => B):Option[B]
  def flatMap[B](f: A => Option[B]):Option[B]
  def getOrElse[B >: A](default: => B): B
  def orElse[B >: A](obj: => Option[B]):Option[B]
  def filter(f: A => Boolean):Option[A]
}

case class Some[A](a:A) extends Option[A] {
  override def map[B](f: (A) => B): Option[B] = {
    Some(f(a))
  }

  override def flatMap[B](f: (A) => Option[B]): Option[B] = {
    f(a)
  }

  override def getOrElse[B >: A](default: => B): B = {

  }

  override def orElse[B >: A](obj: => Option[B]): Option[B] = ???

  override def filter(f: (A) => Boolean): Option[A] = ???
}