public class EmployeeStatic {

    int emp_id;
    static String Organisation;
    static void staticMethod(){
        System.out.println("this is a static method(diff from normal method)");
    }
    void normalMethod(){
        System.out.println("This is a normal method(cannot access like static method)");
    }

    void Details(){
        System.out.println("ID "+" "+ emp_id+"  "+ Organisation);
    }
        public static void main(String[] args) {
            EmployeeStatic.Organisation="KIET";
            //EmployeeStatic.emp_id=123; //error- non static variable exist only when obj is created
            EmployeeStatic es= new EmployeeStatic();
            es.emp_id=101;
            es.normalMethod();
            //es.Organisation="kiet"; error- static variable is accessed in class not with obj.
            es.Details();
            staticMethod();
            //normalMethod()://Cannot make a static refernece for non static method. non static method is called using object.
        }
}
