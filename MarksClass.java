import java.util.*;

class Marks {
    int mark1, mark2, mark3;
 Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    int getTotal() {
        return mark1 + mark2 + mark3;
    }
    double getAverage() {
        return getTotal() / 3.0;
    }
}

public class MarksClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter marks for three subjects:");
        System.out.print("Enter mark1: ");
        int m1 = in.nextInt();

        System.out.print("Enter mark2: ");
        int m2 = in.nextInt();

        System.out.print("Enter mark3: ");
        int m3 = in.nextInt();

        Marks student = new Marks(m1, m2, m3);
        System.out.println("Total Marks: " + student.getTotal());
        System.out.println("Average Marks: " + student.getAverage());

        in.close();
    }
}