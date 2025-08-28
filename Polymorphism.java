
// import java.lang.classfile.Superclass;

//overloading polymorphism- same methods name but diff parameters.
//overriding polymorphism- Same method name, different classes (parent–child), same parameters (runtime).
class EmployeePoly{        
     
    String Emp_name;//variable
    void details(){ //method
        System.out.println("Employee Name: " + Emp_name);
    }
    void details(int Salary){ //method
        System.out.println("Employee Salary: " + Salary);
    }
    void details(String company){ //method
        System.out.println("Employee Company: " + company);
    }
    // public static void main(String[] args) {
    //     EmployeePoly e = new EmployeePoly();   //object
    //     e.Emp_name = "Urvi Gupta";
    //     e.details();
    //     e.details(50000);
    //     e.details("Google");

        
   // }
}

class faculty extends EmployeePoly{
        void details(){
        super.details();
        System.out.println("hi welcome");
    }
    public static void main(String[] args) {
        EmployeePoly f = new faculty();
        f.Emp_name="urvi";
        f.details();
        }
    }