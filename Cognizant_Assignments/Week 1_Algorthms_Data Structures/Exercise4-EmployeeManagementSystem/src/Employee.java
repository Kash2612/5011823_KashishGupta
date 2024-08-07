public class Employee {
    String employeeID;
    String name;
    String position;
    Double salary;

    public Employee(String employeeID, String name,String position,Double salary){
        this.employeeID=employeeID;
        this.name=name;
        this.position=position;
        this.salary=salary;
    }
    public String getEmployeeID(){
        return this.employeeID;
    }

}
