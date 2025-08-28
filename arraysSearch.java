import java.util.*;
public class arraysSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();        
        }

        System.out.println("Enter which element to be searched: ");
        int x=sc.nextInt();
        // for (int i=0;i<size;i++){
        //     System.out.println(arr[i]);
        // }

        for (int i=0;i<size;i++){
            if (arr[i]==x){
                System.out.println("The element "+x+" is at position: "+i);
            }
        }

    }
    
}
