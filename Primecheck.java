import java.util.Scanner;

public class Primecheck {

public static void main(String[] args) {

Scanner in= new Scanner(System.in);

  int j,num,k;

  System.out.println("enter a number");

num=in.nextInt();

 k=1;

 if(num<=1){

 k=0;}

else{

for(j=2;j<=num/2;j++){



 if(num%j==0){

 k=0;

break;

 }

 }

 }

 if(k==1){

System.out.println(+ num is a prime number");

}

else{

System.out.println(+ num + number"); is not a prime

}

}

}
