import java.util.Scanner;

public class ArthurTerozendiEx18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fat;
        fat = in.nextInt();

        System.out.println(fatorial(fat));
    }
    public static int fatorial(int fat){

        if(fat == 0){
            return 1;
        }
        else{
            return fat * fatorial(fat - 1);
        }
    }
}
