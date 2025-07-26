import java.util.Scanner;

 public class SumOfDigits {

public static void main(String[] args) {

Scanner in= new Scanner(System.in);

 int n, m,k,d,s;

 System.out.println("enter the number");

 n=in.nextInt();

 m=n;

 k = 0;

 while (m > 0) {

 m = m / 10

k++;

 }

if(k==4) {

s = 0;

while (n > 0) {

 d = n%10;

 s+=d;

 n = n/10;

 }

22 System.out.print("sum of digit:"+ s);

23 }

24 else{

25 System.out.println(" input 4-digit number");

26 }

27 }

28 }