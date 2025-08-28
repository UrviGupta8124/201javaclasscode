import java.util.*;
public class PrimeNum {
    public static void CheckPrime(int a){
        if (a<=1){
            System.out.println("Not Prime");
        }
        else{
            for (int i=2; i<=Math.sqrt(a);i++){
                if (a%i==0){
                    System.out.println("Not a prime number");
                    return;
                }
                
            System.out.println("Prime number");
                
            }
        }

    }
    public static void main(String[] args) {
        try(Scanner input= new Scanner(System.in)){
            int num=input.nextInt();
            CheckPrime(num);
        }
    }
}