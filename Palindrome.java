package tutorial2;
 import java.util.Scanner;
public class pallindrome {
public static void main(String[] args) {
Scanner in= new Scanner(System.in);
int n,s=0,d,m;
System.out.println("enter a number");
n=in.nextInt();
m=n;
while(n!=0){
 d=n%10;
s=s*10+d;
n=n/10;
}
 if(s==m){
System.out.println("it is pallindrome");
 }
else{
System.out.println("it is not pallindrome");
}
 }
 }
