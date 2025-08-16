class Bird {
     void fly() {
        System.out.println("This bird flies.");
    }
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies short distances.");
    }
}

class Eagle extends Bird {
 void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        Bird[] birds = { new Bird(), new Sparrow(), new Eagle() };
        for (Bird b : birds) {
            b.fly();
        }
    }
}