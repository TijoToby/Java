
import java.util.*;
public class Arraydisp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of elements:");
       int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();

        }
System.out.println("\nArray in the order:");
            for(int i=0;i<n;i++)
{
    System.out.print(a[i]+" ");
}
System.out.println("\nArray in the reverse order:");
            for(int i=n-1;i>=0;i--){
System.out.print(a[i]+" ");
}
            }
}

    
