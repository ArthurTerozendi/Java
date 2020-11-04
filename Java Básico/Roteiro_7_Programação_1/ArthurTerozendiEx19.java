import java.util.Scanner;

public class ArthurTerozendiEx19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fat;
        fat = in.nextInt();

        System.out.println(T(fat));
    }
    public static int T(int n){

        if(n == 1){
            return 1;
        }
        else{
            return 2 * T(n/2) + n;
        }
    }
}
