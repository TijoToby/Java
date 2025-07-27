import java.util.Scanner;

public class ArraysumNavg {
        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no of elements:");
       int n=in.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();

        }
    int s=0;
    for(int i=0;i<n;i++)
    {
        s=s+a[i];

    }
    double avg=(double)s/n;
    System.out.println("Sum of the elements:"+s);
    System.out.println("Average of the elements:"+avg);
}
}
