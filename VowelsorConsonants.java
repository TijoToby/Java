package tutorial2;
import java.util.Scanner;
 public class VowelorConsonents {
public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
char c;
System.out.println("enter the letter");
c=in.next().charAt(0);
 switch (c) {
case 'a','e', 'i', 'o', 'u', 'A', 'E', 'I', '0', 'U':
System.out.println("the letter is a vowel");
 break;
default:
if((c>='a'&&(c<='z')||(c>='A'&& c<='Z'))){
System.out.println("the letter is a consonent" );
}
else{
System.out.println("enter a letter as input");
 }
 break;
}
}
}