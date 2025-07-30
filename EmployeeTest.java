 import java.util.*;
class Employee
{
    int empId;
    String empName;
    double salary;
Employee(int id,String name,double sal)
{
    empId=id;
    empName=name;
    salary=sal;
}
void displayEmployee(){
    System.out.println("Employee ID:"+empId);
    System.out.println("Employee Name:"+empName);
    System.out.println("Salary:"+salary);
    System.out.println("--------------");
}
}
public class EmployeeTest{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
    
System.out.println("Enter the number of employees:");
        int n = in.nextInt();
Employee[] empArray = new Employee[n];
        
        for(int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = in.nextInt();
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Salary: ");
            double sal= in.nextDouble();
            empArray[i] = new Employee(id, name, sal);
        }
        
        System.out.println("\nEmployee Details:");
        for(Employee emp : empArray) {
            emp.displayEmployee();
        }
        
        in.close();
    
    }
}