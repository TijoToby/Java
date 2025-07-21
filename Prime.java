import java.util.Scanner;
 public class Prime{
public static void main(String[] args) {
 Scanner in= new Scanner(System.in);
 int i,j,k;
 System.out.println("prime numbers between 1 to 100 are:");
 for(i=2;i<=100;i++){
 k=1;
 for(j=2;j<Math.sqrt(i);j++){
 if(i%j==0) {
 k=0;
 break;
 }
}
 if(k==1)
 System.out.print(i+" ");
 }
 }
 }
