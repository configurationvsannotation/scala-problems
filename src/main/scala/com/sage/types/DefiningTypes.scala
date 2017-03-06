package com.sage.types

object DefiningTypes {

  class ClassName
  trait TraitName
  object ObjectName

  def foo(x:ClassName) = x
  def bar(x:TraitName) = x
  def baz(x:ObjectName.type) = x

  object Now
  object simulate {
    def once(behavior : () => Unit) = new {
      def right(now : Now.type) : Unit = {}
    }
  }

  def someAction() = ???

  simulate once { () => someAction() } right Now // objects can be used to crate DSLs

}
