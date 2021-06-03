//1. Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of
   //the class and find the product having the lowest price.

import java.io.*;
import java.util.Scanner;
class Product
{
  int pcode;
  String pname;
  Float price;
  
  void read() throws IOException
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the product code:");
    pcode=sc.nextInt();
    
    System.out.println("Enter the product name:");
    pname=sc.next();

    System.out.println("Enter the product price:");
    price=sc.nextFloat();

  }

  void display() throws IOException
  {
    System.out.println("Product code:"+pcode);
    System.out.println("Product name:"+pname);
    System.out.println("Product price:"+price);
   } 

   
    
  public static void main(String args[]) throws IOException
  {
    Product p[]=new Product[5];
    for(int i=1;i<=3;i++)
    {
      p[i]=new Product();
      p[i].read();
     }

     int min=1;
     for(int i=1;i<=3;i++)
     {
       if(p[min].price>p[i].price)
        {
          min=i;
         }
      }

    System.out.println("Product with min price\n");
    p[min].display();
    
    
   
  }
}        
  




















 /*Product p1=new Product();
    Product p2=new Product();
    Product p3=new Product();

    p1.read();
    p2.read();
    p3.read();

    p1.display();
    p2.display();
    p3.display();*/      