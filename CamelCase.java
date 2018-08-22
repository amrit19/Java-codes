import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int i,c=0;
        String s;
        s=ob.next();
        char ch;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch)==true)
                c++;
        }
        c++;
        System.out.println(c);
    }
}
