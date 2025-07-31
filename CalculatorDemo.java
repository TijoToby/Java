import java.util.*;
class MyCalculator {
   double number1;
    double number2;

    MyCalculator(double n1, double n2) {
      number1 = n1;
    number2 = n2;
    }

    public double add() {
        return number1 + number2;
    }

    public double subtract() {
        return number1 - number2;
    }

    public double multiply() {
        return number1 * number2;
    }

    public double divide() {
        return number1 / number2;
    }
    }
public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice;
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice (1–4): ");
            int option = in.nextInt();

            System.out.print("Enter two numbers: ");
            double n1 = in.nextDouble();
            double n2=in.nextDouble();

            MyCalculator calc = new MyCalculator(n1, n2);
            double result;

            switch (option) {
                case 1:
                    result = calc.add();
                    System.out.printf("Result: %.1f%n",result);
                    break;
                case 2:
                    result = calc.subtract();
                    System.out.printf("Result: %.1f%n",result);
                    break;
                case 3:
                    result = calc.multiply();
                    System.out.printf("Result: %.1f%n",result);
                    break;
                case 4:
                  result = calc.divide();
                    if (n2 == 0) {
                        System.out.println("Error");
                        System.out.println("Result:0.0");
                    }
                    else{
                        System.out.printf("Result: %.1f%n", n1, n2, result);
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select 1–4.");
                    break;
            }
 System.out.print("Do you want to continue? (Y/N): ");
            choice = in.next();
            if (choice.equalsIgnoreCase("Y")) {
                main(args); // Restart the calculator
            } else {
                System.out.println("Thank you for using the calculator.");
            }
        in.close();
}
}



