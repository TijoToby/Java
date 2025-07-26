package tutorial2;

import java.util.Scanner;
 public class OddPrint {
public static void main(String[] args) {
 Scanner in= new Scanner(System.in);
 int i,n;
System.out.println("enter a limit");
 n=in.nextInt();
System.out.println("odd numbers from 1 to "+n);
for(i=1;i<=n;i++){
 if(i%2==0){
continue;
}
else{
 System.out.print(i+" ");
}
}
}
}