package vineet

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import scala.language.postfixOps

class PresidentTest extends AnyFlatSpec {
  val president = new President
  //Update Employee ID
  //case 1
  "if we update Employee ID " should "give add prefix into empID " in {
    val res = president.updateEmpId("123")
    assert(res=="POTC123")
  }
  //case 2
  "we update" should "give String" in{
    val res = president.updateEmpId("123")
    res.isInstanceOf[String] should be  (true)
  }
}
