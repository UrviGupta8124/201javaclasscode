import java.util.*;
public class employee {
    int salary;
    String name;
    public void method(){
        System.out.println("Details of employee are: "+ salary + name);
    }

    public static void main(String[] args) {
        Scanner urvi=new Scanner(System.in);
        employee m1=new employee();
        m1.salary= urvi.nextInt();
        m1.name=urvi.next();
        m1.method();
        urvi.close();
    }
    
}
