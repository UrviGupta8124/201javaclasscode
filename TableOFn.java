import java.util.*;
public class TableOFn{
    public static void Table(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
}
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int num=sc.nextInt();
            Table(num);

        }
}
}