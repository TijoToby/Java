import java.util.Scanner;
class Employee {
    String name;
    String address;
    int age;
    int mobile;
    float sal;
    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}
class Officer extends Employee {
    String spl;
 void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}
class Manager extends Employee {
    String dep;
     void print_Dept() {
        System.out.println("Department: " + dep);
    }
}
public class EmployeeManagementdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Officer officer = new Officer();
        System.out.println("Enter Officer's Name:");
        officer.name = sc.nextLine();
        System.out.println("Enter Address:");
        officer.address = sc.nextLine();
        System.out.println("Enter Age:");
        officer.age = sc.nextInt();
        System.out.println("Enter Mobile:");
        officer.mobile = sc.nextInt();
        System.out.println("Enter Salary:");
        officer.sal = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Specialization:");
        officer.spl = sc.nextLine();
        Manager manager = new Manager();
        System.out.println("Enter Manager's Name:");
        manager.name = sc.nextLine();
        System.out.println("Enter Address:");
        manager.address = sc.nextLine();
        System.out.println("Enter Age:");
        manager.age = sc.nextInt();
        System.out.println("Enter Mobile:");
        manager.mobile = sc.nextInt();
        System.out.println("Enter Salary:");
        manager.sal = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Department:");
        manager.dep= sc.nextLine();
        System.out.println("--- Officer Details ---");
        System.out.println("Name: " + officer.name);
        System.out.println("Address: " + officer.address);
        System.out.println("Age: " + officer.age);
        System.out.println("Mobile: " + officer.mobile);
        System.out.print("Salary: ");
        officer.print_Salary();  
        officer.print_Specialization();
       System.out.println("--- Manager Details ---");
        System.out.println("Name: " + manager.name);
        System.out.println("Address: " + manager.address);
        System.out.println("Age: " + manager.age);
        System.out.println("Mobile: " + manager.mobile);
        System.out.print("Salary: ");
        manager.print_Salary();  
        manager.print_Dept();
  sc.close();
    }
}
