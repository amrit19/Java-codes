import java.util.Scanner;

public class merge_two_strings {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t, T, i, l1, l2, j, c = 0;
        T = ob.nextInt();
        String p, q, f;
        for (t = 1; t <= T; t++) {
            f = "";
            p = ob.next();
            q = ob.next();
            l1 = p.length();
            l2 = q.length();
            i = 0;
            j = 0;
            if (l1 == 0)
                System.out.println(q);
            else if (l2 == 0)
                System.out.println(p);
            else {
                while (i < l1 && j < l2) {

                    f=f+p.charAt(i)+q.charAt(j);

                    i++;j++;
                }
                if(i<l1)
                    f=f+p.substring(i);
                if(j<l2)
                    f=f+q.substring(j);
            }
            System.out.println(f);
        }
    }
}
