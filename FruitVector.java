import java.util.Vector;

public class FruitVector {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
