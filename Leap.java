import java.util.Scanner;

public class leap {
  
  public static void main(String[] args) {

Scanner in= new Scanner(System.in);

long leapyear;

System.out.println("enter the year");

leapyear=in.nextLong();

if((leapyear%4==0&&leapyear%100!=0)||(leapyear%400==0)){

System.out.println("it is a leap year");

}

else{

System.out.println("it is not a leap year");

}

}

}
