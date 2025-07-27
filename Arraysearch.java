import java.util.Scanner;

public class Arraysearch {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of elements:");
       int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();

        }
        System.out.println("enter the no to search");
        int s=in.nextInt();
        int k=0;
          for(int i=0;i<n;i++)
          {
            if(s==a[i])
{
System.out.println("Number found at position."+i);
k=1;
break;
}        
 }
 if(k==0)
 {
    System.out.println("Number is not found");
 }
}
}
