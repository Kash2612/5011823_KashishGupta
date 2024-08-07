public class EmployeeFunctions {
    public Employee[] arr;
    public int noOfEmployee;

    public EmployeeFunctions(int size){
        arr = new Employee[size];
        noOfEmployee=0;
    }

    public void addEmployee(Employee newEmp){
        if(noOfEmployee<arr.length){
            arr[noOfEmployee++]=newEmp;
        }else{
            System.out.println("Storage is full");
        }
    }

    public Employee searchEmployee(String employeeID){
        for(int i=0;i<noOfEmployee;i++){
            if(arr[i].getEmployeeID().equals(employeeID)){
                return arr[i];
            }
        }
        return null;
    }

    public void traverse(){
        for(int i=0;i<noOfEmployee;i++){
            System.out.println(arr[i]);
        }
    }

    public void deleteEmployee(String employeeID){
        int index=Integer.MIN_VALUE;
        for(int i =0;i<noOfEmployee;i++){
            if(arr[i].getEmployeeID().equals(employeeID)){
                index=i;
                break;
            }
        }

        if(index!=Integer.MIN_VALUE){
            for(int i=0;i<noOfEmployee;i++){
                arr[i]=arr[i+1];
            }
            arr[noOfEmployee-1]=null;
        }
        else{
            System.out.println("Employee Not found");
        }

    }
}
