import java.util.Arrays;

class GFG{
    public static void main(String args[])
    {
        System.out.println("PRIMITIVE DATE TYPES\n");
        int x=10;
        int y=x;
        System.out.print("Intitally:");
        System.out.println("x = " + x + ", y = " + y);
        
        y=30;

        System.out.print("After changing y to 30: ");
        System.out.println("x= "+x +",y= "+y);

        System.out.println("Reference Date Types:\n");
        int []c={1,2,3,4,5};
        int []d=c;

        System.out.println("Initally::");
        System.out.println("Array c: " + Arrays.toString(c));
        System.out.println("Array d:" +Arrays.toString(d));

        System.out.println("\nModifying the value at "+ "index 1 to 50 in array d\n");
        d[1] = 50;

        System.out.println("After modification");
        System.out.println("Array c: "+ Arrays.toString(c));
        System.out.println("Array d: "+ Arrays.toString(d));
        System.out.println( "**Here value of c[1] is also affected "+ "because of Reference Data Type \n");
    }
}