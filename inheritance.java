class Employee{
    int id=123;
    String name="urvi";
    void display(){
        System.out.println("Name: "+name+" "+id);
    }
    
}

class facultyy extends Employee{
    String Sub;
    String Dept;
    void Display(){
        System.out.println("Subject "+Sub+" "+"Departement "+Dept);
    }
    


}




public class inheritance {
    public static void main(String[] args) {
        facultyy fac=new facultyy();
        //fac.Sub="eng";
        //fac.Dept="cs";
        fac.display();
        fac.Display();
    }
    
}
