import java.util.Scanner;

public class ArthurTerozendiEx17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y;
        x = in.nextInt();
        y = in.nextInt();

        System.out.println(mdc(x, y));
    }
    public static int mdc(int x, int y){
        if (y == 0){
            return x;
        }
        else{
            return mdc(y, x%y);
        }
    }
}
