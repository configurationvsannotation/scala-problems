package com.sage.implicits

trait ThreadStrategy {
  def execute[A](func : Function0[A]) : Function0[A]
}
