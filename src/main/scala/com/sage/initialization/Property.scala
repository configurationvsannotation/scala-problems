package com.sage.initialization

trait Property {
  val name: String
  override val toString = "Property(" + name + ")"
}
