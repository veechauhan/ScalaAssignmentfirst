package vineet

class AttendanceService{
  def addAttendanceService(empId:String,startTime:String,endTime:String): String ={
    val totalTime="9hours"
    s"$empId $startTime $endTime $totalTime"

  }
  def addAttendanceService(empId:String): String={

    var startTime:String="9:45am"
    var endTime:String="6:45pm"
    val totalTime:String ="9hours"
    s"$empId $startTime $endTime $totalTime"


  }
}