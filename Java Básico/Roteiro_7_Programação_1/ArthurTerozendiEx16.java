import java.util.Scanner;

public class ArthurTerozendiEx16 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int  n, m;
        m = in.nextInt();
        n = in.nextInt();

        System.out.println(A(m,n));
    }
    public static int A(int m, int n){
        if (m == 0){
            return n + 1;
        }
        else if(m > 0 && n == 0){
            return A(m - 1, 1);
        }
        else {
            return A(m - 1, A(m, n - 1));
        }
    }
}
