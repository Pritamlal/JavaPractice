import java.io.*;
import java.util.Scanner;

public class input {
    public static void main(String[] args)
    {
    Scanner scn = new Scanner(System.in);

    String name;
    int rollno;
    float marks;

    
    System.out.println("Enter your name");
    name = scn.next();
   
    System.out.println("Enter you Number");
    rollno = scn.nextInt();
    
   
    System.out.println("Enter your Mark::");
    marks = scn.nextFloat();

    System.out.println("The Name is : "+name);
    System.out.println("The Rollno is :"+rollno);
    System.out.println("The Mark is :"+marks);
    }
}
