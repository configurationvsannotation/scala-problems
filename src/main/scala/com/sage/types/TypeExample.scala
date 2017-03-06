package com.sage.types

object TypeExample extends App{

  case class Lover(name:String)
  case class Fighter(name:String)
  implicit def fighterTo(fighter:Fighter) = Lover(fighter.name)

  def fallIn[T <% Lover](lover: T): Unit ={
    println(s"${lover.name} is a lover")
  }

  fallIn(Fighter("Biff"))

}

