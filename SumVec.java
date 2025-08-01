import java.util.Vector;
public class SumVec {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
 int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}