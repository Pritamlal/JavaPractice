import java.io.*;

public class buff {
    public static void main(String args[])
    throws IOException
    {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        String str = bfn.readLine();

        int it = Integer.parseInt(bfn.readLine());

        System.out.println("Entered String :: "+str);

        System.out.println("Enter number :: "+it);
    }
}
