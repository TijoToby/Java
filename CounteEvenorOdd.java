import java.util.*;
public class CounteEvenorOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of elements:");
       int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int oddcount=0;
        int evencount=0;
        for(int num:a)
        {
            if(num%2==0)
    evencount++;
    else 
    oddcount++;

        }
        System.out.println("\nNumber of even elements:"+evencount);
         System.out.println("\nNumber of odd elements:"+oddcount);
    }
}
