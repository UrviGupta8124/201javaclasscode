public class finalll {
    int emp_id=123;
    final String Organisation="Kiet";

        
    void Display(){
        System.out.println("hi!"+"\n"+emp_id+" "+Organisation);

    }
}




class faculty extends finalll{
        
void display(){
    System.out.println("this is child class ");
}

public static void main(String[] args) {
    faculty subclasss= new faculty();
    
    subclasss.display();
        //finalll f=new finalll();
    subclasss.Display();
    //f.emp_id=201;
        //f.Organisation="abes"; error- cannot change final value. final value is const throughout code.
         
        //f.Display();
    }
    }

