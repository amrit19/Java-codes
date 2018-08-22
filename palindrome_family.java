import java.util.Scanner;

public class palindrome_family {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String s = "";
        String so = "";
        String se = "";
        int i, n, t, T, l;
        t = ob.nextInt();
        for (T = 1; T <= t; T++) {
            so="";se="";
            s = ob.next();
            l = s.length();
            for (i = 0; i < l; i = i + 2)
             so = so + s.charAt(i);
             System.out.println(so+'\n');
            for (i = 1; i < l; i = i + 2)
                se = se + s.charAt(i);
            if (palin(s) == 1)
                System.out.println("PARENT");
            else if (palin(so) == 1 && palin(se) == 1)
                System.out.println("TWIN");
            else if (palin(so) == 1)
                System.out.println("ODD");
            else if (palin(se) == 1)
                System.out.println("EVEN");
            else
                System.out.println("ALIEN");
        }
    }

    public static int palin(String s) {
        int i, l, j;
        l = s.length();
        for (i = 0, j = l - 1; i < l; i++, j--) {
            if (s.charAt(i) == s.charAt(j))
                continue;
            else
                return 0;
        }
        return 1;
    }
}




