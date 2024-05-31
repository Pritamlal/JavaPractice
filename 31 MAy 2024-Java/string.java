import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class string{
    public static void main(String args[])
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name;
        try{
            System.out.println("Enter the String::");
            name = reader.readLine();
            System.out.println("Name::"+name);
        }
        catch(Exception e){

        }
    }
}