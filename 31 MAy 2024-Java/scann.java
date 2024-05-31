import java.util.Scanner;
public class scann {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string and Integer::");

        int a = sc.nextInt();
         
        String b = sc.next();

        System.out.printf("You have entered::" +a+ " "+"and name as::" +b);
    }    
}
