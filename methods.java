public class methods {
    int id;
    String name;

    public void display(){
        // System.out.println("Details are ",id+name);
        System.out.println("details are : "+ name + id);
    }
    
    public static void main(String[] args){ 
        methods m1= new methods(); // "m1"- is variable pointing to new object and "new methods()"-tells Java to create a fresh object
        m1.id=23;
        m1.name="krishna";
        m1.display();

    }
}
