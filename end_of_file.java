import java.util.Scanner;

public class end_of_file {
    public static void main(String[] args) {

        int i=1;
            Scanner ob = new Scanner(System.in);
            while (ob.hasNext())
            {
                System.out.print(i+" "+ob.nextLine());
                System.out.println();
                i++;

            }

    }
}
