import java.util.Scanner;

public class second_most_string {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n, i, t, T, j, c, x, pos, max;
        T = ob.nextInt();
        for (t = 1; t <= T; t++) {
            c = 0;
            x = 0;
            pos = 0;
            n = ob.nextInt();
            String a[] = new String[n];
            // String b[]=new String[n];
            int d[] = new int[n];
            for (i = 0; i < n; i++)
                a[i] = ob.next();
            max = -1;
            for (i = 0; i < n; i++) {
                c = 0;
                for (j = 0; j < n; j++) {
                    if (a[i].equals(a[j]))
                        c++;
                }
                d[x] = c;
                x++;
                if (d[x] > max)
                    max = x;
            }
            pos = -1;
            for (i = 0; i < n; i++) {
                if (d[i] > pos && a[i].equals(a[max]) != true) {
                    pos = i;
                }

            }
            System.out.println(a[pos]);
        }
    }
}

