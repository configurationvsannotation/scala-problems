package com.sage.scope.test

object Test extends App{


  object Wildcard {
    def x = "Wildcard Import x"
  }
  object Explicit {
    def x = "Explicit Import x"
  }
  testSamePackage()
  testWildcardImport()
  testExplicitImport()
  testInlineDefinition()

  def testSamePackage() {
    println(x)
  }
  def testWildcardImport() {
    import Wildcard._
    println(x)
  }
  def testExplicitImport() {
    import Explicit.x
    import Wildcard._
    println(x)
  }
  def testInlineDefinition() {
    val x = "Inline definition x"
    import Explicit.x
    import Wildcard._
    println(x)
  }

}

