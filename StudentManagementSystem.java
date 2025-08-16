import java.util.Scanner;
class Students {
    String name;
    int rollNo;
    String course;
    Students(   String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
  void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class StudentAccount extends Students {
    double collegeFee;
    StudentAccount(String name, int rollNo, String course, double collegeFee) {
        super(name, rollNo, course);
        this.collegeFee = collegeFee;
    }
   void displayCollegeFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}
class Hosteller extends StudentAccount {
    double hostelFee;
    double messFee;

     Hosteller(String name, int rollNo, String course, double collegeFee, double hostelFee, double messFee) {
        super(name, rollNo, course, collegeFee);
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }
      void displayAllDetails() {
        System.out.println("--- HOSTELLER DETAILS ---");
        displayDetails();
        displayCollegeFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        double total = collegeFee + hostelFee + messFee;
        System.out.println("Total Fee: " + total);
    }
}
class DayScholar extends StudentAccount {
    double busFee;

     DayScholar(String name, int rollNo, String course, double collegeFee, double busFee) {
        super(name, rollNo, course, collegeFee);
        this.busFee = busFee;
    }

    void displayAllDetails() {
        System.out.println("--- DAY SCHOLAR DETAILS ---");
        displayDetails();
        displayCollegeFee();
        System.out.println("Bus Fee: " + busFee);
        double total = collegeFee + busFee;
        System.out.println("Total Fee: " + total);
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Hosteller's Name:");
        String hName = sc.nextLine();
        System.out.println("Enter Roll No:");
        int hRoll = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter Course:");
        String hCourse = sc.nextLine();
        System.out.println("Enter College Fee:");
        double hCollege = sc.nextDouble();
        System.out.println("Enter Hostel Fee:");
        double hHostel = sc.nextDouble();
        System.out.println("Enter Mess Fee:");
        double hMess = sc.nextDouble();
Hosteller hosteller = new Hosteller(hName, hRoll, hCourse, hCollege, hHostel, hMess);
 sc.nextLine();
        System.out.println("Enter Day Scholar's Name:");
        String dName = sc.nextLine();
        System.out.println("Enter Roll No:");
        int dRoll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course:");
        String dCourse = sc.nextLine();
        System.out.println("Enter College Fee:");
        double dCollege = sc.nextDouble();
        System.out.println("Enter Bus Fee:");
        double dBus = sc.nextDouble();
     DayScholar dayScholar = new DayScholar(dName, dRoll, dCourse, dCollege, dBus);
         System.out.println();
        hosteller.displayAllDetails();
        System.out.println();
        dayScholar.displayAllDetails();

        sc.close();
    }
}
    
