import java.util.Scanner;

public class two_d_array {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int i,j,s=0,max=-90;
        int a[][]=new int[6][6];
        for(i=0;i<6;i++)
        {
            for(j=0;j<6;j++)
            {
                a[i][j]=ob.nextInt();

            }
        }
        for(i=0;i<4;i++)
        {

            for(j=0;j<4;j++)
            {
                s=0;
                s = s + a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];


                if (s > max)
                    max = s;
            }
        }
        System.out.println(max);


    }
}
