public class Const {
    String color;
    int speed;

    // Constructor with 2 parameters
    Const(String c, int s) {
        color = c;  // initialize color
        speed = s;  // initialize speed
    }
    Const(Const c){
        color=c.color;
        speed=c.speed;
    }
    
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Const car = new Const("Red", 120); // pass 2 values
        car.display();
        Const copy= new Const(car);

        copy.display();
    //     Constructor copy;
    //     copy=myCar;
    //     copy.display();
    //
     }
}
