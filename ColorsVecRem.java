import java.util.Vector;

public class ColorsVecRem{
    public static void main(String[] args) {
          Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        boolean removed = colors.remove("Green");
 if (removed) {
            System.out.println("\"Green\" was removed.");
        } else {
            System.out.println("\"Green\" was not found in the vector.");
        }

        System.out.println("Final contents:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
