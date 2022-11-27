package employeemap;

import java.util.Scanner;

public class Demo
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
EmployeeMap employeeMap = new EmployeeMap();

employeeMap.add(new Employee("William", 111));
employeeMap.add(new Employee("Phillip", 2935));
employeeMap.add(new Employee("George", 2233));
employeeMap.add(new Employee("Alex", 6672));

while(true)
{
try
{
System.out.print("Employee Number: ");
int id = scanner.nextInt();

String name = employeeMap.lookUp(id);

if(name == null)
{
throw new Exception();
}

System.out.println("Name: " + name);
}
catch(Exception e)
{
System.out.println("ERROR: Invalid ID");
   }
  }
 }
}