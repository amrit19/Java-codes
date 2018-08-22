import java.util.Scanner;

public class jugglers_algo {

        public static void main(String[] args) {
            int n, i, d, gc, j, temp, c=0;
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter the size of array \n");
            n = ob.nextInt();
            System.out.println("Enter the location till which you want to rotate the array \n");
            d = ob.nextInt();
            int a[] = new int[n];
            gc = gcd(n, d);
            //creating the array
            System.out.println("Enter the elements of the array");
            for (i = 0; i < n; i++)
                a[i] = ob.nextInt();
            while (true) {
                for (j = c; j + gc < n; j = j + gc) {
                    temp = a[j];
                    a[j] = a[j + gc];
                    a[j + gc] = temp;
                }
                c = c + 1;
                if (c == gc)
                    break;
            }
            //printing the rotated array
            for (i = 0; i < n; i++)
                System.out.print(a[i] + " ");


        }

        public static int gcd(int n, int d) {
            int i, p=0;
            for (i = 1; i <= d; i++)
                if (n % i == 0 && d % i == 0)
                    p = i;
            return p;
        }
    }




