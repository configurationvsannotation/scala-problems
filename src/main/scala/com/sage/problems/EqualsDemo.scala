package com.sage.problems

case class EqualsDemo(x:Int) extends Equals{
  override def canEqual(that: Any): Boolean = that.isInstanceOf[EqualsDemo]

  override def equals(obj: scala.Any): Boolean = {
    canEqual(obj) match {
      case true => this.x == obj.asInstanceOf[EqualsDemo].x
      case _ => false
    }
  }

  override def hashCode(): Int = x.hashCode()
}
object Runner extends App{
  val e1 = EqualsDemo(1)
  val e2 = EqualsDemo(1)
  println(s"e1 and e2 are equal(Deep Equality): ${e1 == e2}") // calls equals()
  println(s"e1 and e2 are equal (Referential Equality): ${e1 eq e2}")
  println(e1.##)
}
