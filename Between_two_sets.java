import java.util.Scanner;
public class Between_two_sets {
    public static void main(String[] args) {
        int n, m, i, x = 1, f = 0, max = 0, c = 0, p = 1;long lcm=0,min=0;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the values of size of array a and b");
        n = ob.nextInt();
        m = ob.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        System.out.println("enter elements of array a");
        for (i = 0; i < n; i++)
            a[i] = ob.nextInt();
        System.out.println("enter elements of array b");
        for (i = 0; i < m; i++)
            b[i] = ob.nextInt();
        min=b[0];
        for(i=0;i<m;i++)
        {
            if(b[i]<min)
                min=b[i];
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        if(max<min) {
            while (x > 0) {
                for (i = 0; i < n; i++) {
                    if (x % a[i] != 0) {
                        f = 1;
                        break;
                    }


                }
                if (f == 0) {
                    lcm = x;
                    break;
                }
                f = 0;
                x++;
            }
            if (lcm == 0) {
                for (i = 0; i < n; i++)
                    p = p * a[i];
                lcm = p;
            }

            System.out.println("lcm=" + lcm);
            for (i = 0; i < m; i++) {
                if (b[i] > max)
                    max = b[i];
            }
            while (lcm < max) {
                f = 0;
                for (i = 0; i < m; i++) {
                    if (b[i] % lcm == 0)
                        f = 1;
                    else {
                        f = 0;
                        break;
                    }
                }
                if (f == 1)
                    c++;
                lcm = lcm + lcm;
            }
        }
        System.out.println(c);
    }
}
