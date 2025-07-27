import java.util.*;
public class Arraysort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of elements:");
       int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
}
Arrays.sort(a);
System.out.println("\nArray elements in ascending order");
for(int num:a)
System.out.print(num+" ");
    }
}