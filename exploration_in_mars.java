import java.util.Scanner;

public class exploration_in_mars {
    public static void main(String[] args) {
        int i, l, c = 0, j, ch;
        Scanner ob = new Scanner(System.in);
        String s = "";
        s = ob.nextLine();
        l = s.length();
        i = 0;
        j = l - 1;
        while (i < l && j >= 0) {
            if (s.charAt(i) != s.charAt(j))
                c = 1;
            i++;
            j--;
        }
        if (c == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
