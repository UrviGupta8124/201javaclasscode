import java.util.*;
public class Arrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= sc.nextInt();        
        //int[] marks = new int[3]; or int marks[]=new int[3]
        int marks[]=new int[size];
        //int marks[]={97,98,95};
        //marks[0]=97;//physics
        //marks[1]=98;//chemistry
        //marks[2]=95;//english
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for (int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.println("["+i+"]"+"="+marks[i]);
        }
    }
    
}
