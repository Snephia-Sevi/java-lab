import java.util.Scanner;
class Person
{
String name;
String gender;
String address;
int age;

Person()
{
 name=" ";
 gender="m ";
 address="";
 age=0;
}

void read() 
{
Scanner sc=new Scanner(System.in);
System.out.println("\n\nEnter Name:");
name=sc.nextLine();
System.out.println("\nEnter gender:");
gender=sc.nextLine();
System.out.println("\nEnter address:");
address=sc.nextLine();
System.out.println("\nEnter age:");
age=sc.nextInt();
}

void display() 
{
System.out.println("\n\nName:"+name);
System.out.println("Gender:"+gender);
System.out.println("Address:"+address);
System.out.println("Age:"+age);
}
}
class Employee extends Person
{
String empid;
String comname;
String quali;
int salary;

Employee()
{
 empid=" ";
 comname=" ";
 quali=" ";
 salary=1000;
}

void read() 
{
super.read();
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter empid:");
empid=sc.nextLine();
System.out.println("\nEnter company name:");
comname=sc.nextLine();
System.out.println("\nEnter qualification:");
quali=sc.nextLine();
System.out.println("\nEnter salary:");
salary=sc.nextInt();
}

void display() 
{
super.display();
System.out.println("Empid:"+empid);
System.out.println("Company Name:"+comname);
System.out.println("Qualification:"+quali);
System.out.println("Salary:"+salary);
}
}
 class Teacher extends Employee
{
String dept;
String subject;
String teacherid;


Teacher()
{
dept="";
subject="";
teacherid=" ";

}

void read() 
{
super.read();
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter dept name:");
dept=sc.nextLine();
System.out.println("\nEnter subject name:");
subject=sc.nextLine();
System.out.println("\nEnter teacherid:");
teacherid=sc.nextLine();

}

void display()  
{
super.display();
System.out.println("Department:"+dept);
System.out.println("Subject:"+subject);

}
}

class TestPerson
{
 
public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
 System.out.println("no. of persons:");
 int n=sc.nextInt();
 Teacher t[]=new Teacher[n];
  for(int i=0;i<n;i++)
    {
     t[i]=new Teacher();
     t[i].read();
    }
  for(int j=0;j<n;j++)
   {
    t[j].display();
   }
}
}

