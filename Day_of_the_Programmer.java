import java.util.Scanner;

public class Day_of_the_Programmer {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int y;
        y=ob.nextInt();
        if(y<1918)
        {
            if(y%4==0)
                System.out.println("12.09."+y);
            else
                System.out.println("13.09."+y);
        }
        if(y>1918)
        {
            if((y%100==00 && y%400==0)||(y%100!=00 && y%4==0))
                System.out.println("12.09."+y);
            else
                System.out.println("13.09."+y);
        }
        if(y==1918)
        {
            System.out.println("26.09."+y);
        }
    }
}
