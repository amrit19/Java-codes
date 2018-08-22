import java.util.Scanner;

public class Designer_pdf_viewer {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a[]= new int[26];
        int i,max=0,j;
        String s="";char ch;
        for(i=0;i<26;i++)
        a[i]=ob.nextInt();
        s=ob.next();
        for(i=0;i<26;i++) {
            for (j = 0; j < s.length(); j++) {
                ch = s.charAt(j);
                if (ch - 97 == (i))
                    if (a[i] >= max)
                        max = a[i];
            }
        }
        System.out.println((s.length()*max));
    }
}
