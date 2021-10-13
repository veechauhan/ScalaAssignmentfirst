package vineet
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import scala.language.postfixOps


class ManagerTest extends AnyFlatSpec {
  val manager = new Manager
  //Update Employee ID  Test
  //case 1
  "if we update Employee ID " should "give add prefix into empID " in {
    val res = manager.updateEmpID("123")
    assert(res=="MANA123")
  }
  //case 2
  "we update" should "give String" in{
    val res = manager.updateEmpID("123")
    res.isInstanceOf[String] should be  (true)
  }


}
