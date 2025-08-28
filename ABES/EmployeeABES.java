package ABES;
import KIET.*;
import KIET.EmployeeKiet;
public class employeeabes extends EmployeeKiet{ //subclass another package- protected and public hojayenge
public class EmployeeABES {
    public static void main(String[] args) {
        //EmployeeKiet son= new EmployeeKiet(); id we extended EmployeeKiet now we cannot use it to make obj we have to use employeeabes
        //son.Emp_Name="Urvi_Gupta";
        //son.Emp_id=184; error- cannot acess protect, default and private thorugh diff package
        //son.Salary=200; error
        //son.Organisation="ABES Groups"; error
        employeeabes son= new employeeabes();
        son.Emp_Name="Urvi";
        son.Emp_id=8124;
       // son.Salary=500; error- private
       //son.Organisation='ABES GROUPS'; error- default

    }
}
}