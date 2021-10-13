package vineet
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import scala.language.postfixOps

class consultantTest extends AnyFlatSpec {
  val consultant = new Consultant
  //Update Employee ID  Test
  //case 1
  "if we update Employee ID " should "give add prefix into empID " in {
    val res = consultant.updateEmpId("123")
    assert(res=="CONS123")
  }
//  case 1
  "Consultant" should "give String" in{
    val res = consultant.updateEmpId("123")
    res.isInstanceOf[String] should be  (true)
  }



}
