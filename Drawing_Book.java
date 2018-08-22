import java.util.Scanner;

public class Drawing_Book {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n, i, p, f, b;
        n = ob.nextInt();
        p = ob.nextInt();
        f = b = 0;
        for (i = 1; i <= n; i = i + 2) {
            if (i < p) {
                f++;
            }}
            for (i = n; i >= 0; i = i - 2) {
                if (i > p) {
                    if (i % 2 != 0 && i - 1 != p)
                        b++;
                    else if (i % 2 == 0)
                        b++;

                }
            }
            if (f < b)
                System.out.println(f);
            else
                System.out.println(b);

        }

}
