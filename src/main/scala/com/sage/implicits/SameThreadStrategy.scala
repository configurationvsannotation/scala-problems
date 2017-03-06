package com.sage.implicits

object SameThreadStrategy extends ThreadStrategy {
  def execute[A](func : Function0[A]) = func
}
