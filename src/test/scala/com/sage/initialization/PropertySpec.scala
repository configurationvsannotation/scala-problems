package com.sage.initialization

import org.scalatest.FlatSpec

class PropertySpec extends FlatSpec{

  "Initalizing abstract fields" should "not take place at the time of initilizing" in {
    assert(new Property {override val name="Biff"}.toString == "Property(null)")
  }
  "Initalizing abstract fields" should "not take place using with" in {
    assert((new {
      override val name = "Biff"
    } with Property).toString == "Property(Biff)")
  }
}
