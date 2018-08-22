import java.util.Scanner;

public class Cats_and_a_mouse {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int q,i,x,y,z;
        q=ob.nextInt();
        for(i=1;i<=q;i++)
        {
            x=ob.nextInt();
            y=ob.nextInt();
            z=ob.nextInt();
            if(Math.abs(z-x)<Math.abs(z-y))
                System.out.println("Cat A");
            else if(Math.abs(z-x)>Math.abs(z-y))
                System.out.println("Cat B");
            else  if(Math.abs(z-x)==Math.abs(z-y))
                System.out.println("Mouse C");
        }
    }
}
