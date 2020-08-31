

import org.scalatest._

class ListOfElementTest extends FlatSpec {
  
  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)            
  }
  it should "produce NoSuchElementException when head is invoked" in { 
    intercept[NoSuchElementException] {                                
      Set.empty.head
    }
  }
  ignore should "be empty" in { 
    assert(Set.empty.isEmpty)
  }
  it should "not be non-empty" ignore { 
    assert(!Set.empty.nonEmpty)
  }
  "A non-empty Set" should "have the correct size" in { 
    assert(Set(1, 2, 3).size == 3)
  }
  
  it should "return a contained value when head is invoked" is (pending)
  import tagobjects.Slow
  it should "be non-empty" taggedAs(Slow) in { // Tag a test
    assert(Set(1, 2, 3).nonEmpty)
  }
}


class StringSpec extends fixture.FlatSpec {
  type FixtureParam = String 
  override def withFixture(test: OneArgTest) = {
    
    val fixture = "a fixture object" 
    try test(fixture) 
    finally {
      
    }
  }
  "The passed fixture" can "be used in the test" in { s => 
    assert(s == "a fixture object")
  }
}

