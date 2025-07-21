import java.util.Scanner;

public class Factorial {

public static void main(String[] args) {

Scanner in= new Scanner(System.in);
  
  int n,i=1,fact=1;

System.out.println("enter the number");

n=in.nextInt();

while (i<=n) {

fact=fact*i;

i++;

}

System.out.println("factorial of the number:"+fact);

}

}
