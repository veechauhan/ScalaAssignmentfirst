package vineet
trait employee{
  var empId:String=""
  var firstName:String=""
  var lastName:String=""
  var salary:Double=0

  def addEmpID(empId:String):Unit={
    this.empId=empId
  }
  def addFirstName(firstName:String):Unit={
    this.firstName=firstName
  }
  def addLastName(lastName:String):Unit={
    this.lastName=lastName
  }
  def addSalary(salary:Double):Unit={
    this.salary=salary
  }

}
