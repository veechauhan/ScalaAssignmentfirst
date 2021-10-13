package vineet
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import scala.language.postfixOps
class AttendanceServiceTest extends AnyFlatSpec {
  val attendanceService = new AttendanceService()
  //Update Employee ID  Test
  //case 1
  "AttendanceService1 " should "give" in {
    val res = attendanceService.addAttendanceService("CONS123","9:45am","6:45pm")
    assert(res=="CONS123 9:45am 6:45pm 9hours")
  }
  //  case 2
  "AttendanceService2 " should "give" in {
    val res = attendanceService.addAttendanceService("CONS123")
    assert(res=="CONS123 9:45am 6:45pm 9hours")
  }


}
