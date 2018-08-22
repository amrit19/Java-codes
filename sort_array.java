import java.util.Scanner;

public class sort_array {
public static void getIntegers() {
    int a[]=new int[20];
    int c = 0, i, j, t;
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the array you need to sort \n");
    while (true) {
        //a[c]=0;
        a[c] = ob.nextInt();
        c++;
        System.out.println("press 1 if you want to continue else press 0 \n");
        if (ob.nextInt() == 1)
            continue;
        else
            break;
    }
    sortintegers(a,c);
}
public static void sortintegers(int a[],int c) {
    int i,j,t;

    for (i = 0; i < c - 1; i++) {
        for (j = 0; j < c - 1; j++) {
            t = a[j];
            a[j] = a[j + 1];
            a[j + 1] = t;
        }
    }
    for(i=0;i<c-1;i++)
        System.out.println(a[i]);
}

    public static void main(String[] args) {
        getIntegers();

    }

}

