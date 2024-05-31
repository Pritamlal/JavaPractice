import java.util.Scanner;

public class scanner {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        String name = scn.nextLine();

        char gender = scn.next().charAt(0);

        int age = scn.nextInt();

        float mark = scn.nextFloat();

        double cgpa = scn.nextDouble();

        System.out.println("The Name is :: "+name);
        System.out.println("The Gender is ::"+gender);
        System.out.println("The age is :"+age);
        System.out.println("The mark is :"+mark);
        System.out.println("The CGPA is ::"+cgpa);
    }
}
