import java.util.Scanner;

public class EvenNumber {

public static void main(String[] args) {

Scanner in= new Scanner(System.in);

int i=1;

System.out.println("even numbers from 1 -20:\n");

do{

if(i%2==0){

System.out.println(i);

}

i++;

}while(i<=20);

}

}
