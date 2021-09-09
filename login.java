import java.io.*;
import java.util.Scanner;
 class UsernameException  extends Exception  
{  
    public void show()  
    {  
      
      System.out.println("Username Exception Catched:" );
       System.out.println("Username must be greater than 6 character"); 
          
    }  
}
 
class PasswordException  extends Exception  
{  
    public void show()  
    {   
      System.out.println("Password Exception Catched:" );
      System.out.println("Incorrect password is occure: Please enter the currect password");
          
    }  
}
 
class login
{
 public static void main(String arg[])
  {
  String u,p;
  Scanner sc= new Scanner(System.in);
 System.out.println("Enter your username");
 u=sc.nextLine();
 System.out.println("Enter your Password");
 p=sc.nextLine();
  int length = u.length();
 try
  {
    if(length<6)
      throw new UsernameException();
    else if(!p.equals("abcd"))
      throw new PasswordException();
    else
     System.out.println("Loging Succesfully" );
   }
 catch(UsernameException e)
      {
        e.show();  
      }
catch(PasswordException e)
      {
        e.show();  
      }
}  
}