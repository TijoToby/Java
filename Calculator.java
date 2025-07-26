package tutorial2;

import java.util.Scanner;
public class calculator {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
double n1, n2,s;
char op;
 System.out.print("Enter first number: ");
 n1=in.nextDouble();
System.out.print("Enter second number: ");
 n2=in.nextDouble();
System.out.print("Enter operator:");
op=in.next().charAt(0);
switch (op) {

case '+':
s=n1 + n2;
 System.out.println("sum: " + s);
break;
case '-':
s=n1-n2;
System.out.println("difference: " +s);
break;
case '*':
 s=n1*n2;
System.out.println("product:" +s);
break;
case '/':
if(n2 != 0) {
s = n1 / n2;
System.out.println("quotient: " + s);
} else {
System.out.println(" Cannot divide by zero.");
}
 break;
default:
 System.out.println("Invalid operator");
}
}
 }