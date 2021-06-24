 import java.util.Scanner;
class BookInheritance
{
public static void main(String args[])
  {
   Scanner sc= new Scanner(System.in);
  System.out.println("how many book details to enter:");
  int count=sc.nextInt();
   book b[]=new book[count];
   for (int i=0; i<count; i++)
   {
    b[i]=new book();
    b[i].read();
    }
    Scanner st= new Scanner(System.in);
     System.out.println("\nEnter the category of book you want to see(literature/fiction):");
     String ct=st.nextLine();
     boolean flag=false;
    for (int i=0; i<count; i++)
    {
      if(ct.equals(b[i].category))
       {
             System.out.println(ct+" category book  details:");
             b[i].show();
             flag=true;
       }
     else
       {
        continue;
}
    }
if(!flag)
    System.out.println("your searched category book is not available:");
  }
}
class publisher
{
String name;
String location;
String ISBN_number;
void read()
{
Scanner sc= new Scanner(System.in);
System.out.println("\n\nEnter name of publisher:");
name=sc.nextLine();
System.out.println("Enter the location:");
location=sc.nextLine();
System.out.println("Enter the ISBN number:");
ISBN_number=sc.nextLine();
}
}
class book extends publisher
{
String author;
String title;
int price;
String category;
void read()
{
super.read();
Scanner sc= new Scanner(System.in);
System.out.println("Enter name of author name:");
author=sc.nextLine();
System.out.println("Enter the book title:");
title=sc.nextLine();
System.out.println("Enter the category of book(literature/fiction):");
category=sc.nextLine();
System.out.println("Enter the price of book:");
price=sc.nextInt();
}
void show()
{
System.out.println("\n\nThe book name : "+title);
System.out.println(" The book author name  :"+author);
System.out.println(" category of the book :"+category);
System.out.println(" publisher of the book :"+name);
  System.out.println(" publisher location is :"+location);
System.out.println(" publisher ISBN number :"+ISBN_number);
System.out.println("price of book:"+price);
}
}