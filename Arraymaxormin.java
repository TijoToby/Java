import java.util.Scanner;

public class Arraymaxormin {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of elements:");
       int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();

        }
        int max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++)
        {
if(a[i]>max)
{
    max=a[i];
}
if(a[i]<min)
{
    min=a[i];
}    
        }
System.out.println("Maximum value in the array:"+max);  
System.out.println("Minimum value in the array:"+min);  
}
}    

