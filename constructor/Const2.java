public class Const2 {
    String color;
    int speed;

    Const2(String d) {
        color = d;
    }
    
    Const2(int n){
        speed=n;
    }

    Const2(Const2 s1){
        color=s1.color;
        speed=s1.speed;
    }
    
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Const2 car = new Const2("Red"); // pass 2 values
        car.display();
        
        Const2 num= new Const2(1);
        num.display();

        Const2 copy= new Const2(car);
        copy.display();
    //     Constructor copy;
    //     copy=myCar;
    //     copy.display();
    //
     }
}
