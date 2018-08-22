import java.util.Scanner;

public class java_loops_two {

    public static void main(String[] args) {
        int i,n,c=1;
        String s="";char p;
        Scanner ob = new Scanner(System.in);
        while(true)
        {
            if(ob.hasNext())
            {
                s=ob.next();
                System.out.print(c+" "+s);
                c++;
                p=s.charAt(0);
                if(Character.isUpperCase(p))
                    System.out.println();
            }
            else

                break;
        }


    }
}