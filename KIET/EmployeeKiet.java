package KIET;

public class EmployeeKiet {
    public String Emp_Name; //public acess modifier
    private int Salary;   // private access modifier
    protected int Emp_id; //protected
    String Organisation;   //default access modifier
    void employeeDetails(){
        System.out.println("Details of kiet employees are:"+"\n"+Emp_id+ " "+Emp_Name+" "+Salary);
    }

    public static void main(String[] args){
        EmployeeKiet emp= new EmployeeKiet();
        emp.Emp_Name="Priya_Chauhan";
        emp.Emp_id=201;
        emp.Organisation="KIET GROUP OF INSTITUTION";
        emp.Salary=10000;
        emp.employeeDetails();
    }
}
