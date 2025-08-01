import java.util.*;

public class SearchVec {
    public static void main(String[] args) {
        Vector<String> items = new Vector<>();
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an item name: ");
        String  s = in.nextLine(); 
  if (items.contains(s)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
    }
}