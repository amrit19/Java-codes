import java.util.Scanner;

public class strange_advertising {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n,i;
        double like=5,share=5,s=0;
        n=ob.nextInt();
        for(i=1;i<=n;i++) {
            like = share;
            like = Math.floor(like / 2);
            share = like * 3;
            s = s + like;
        }

            System.out.println((int)s);

    }
}
