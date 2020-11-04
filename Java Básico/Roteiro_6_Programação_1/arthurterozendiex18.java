import java.util.Arrays;
import java.util.Scanner;

public class arthurterozendiex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        n = in.nextInt();
        int mao[][] = new int[n][2], win[] = new int[2];
        Arrays.fill(win, 0);
        for (int i = 0; i < mao.length; i++) {
            for (int j = 0; j < mao[i].length; j++) {
                mao[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < mao.length; i++) {
            if (mao[i][0] == 0){
                if (mao[i][1] == 3) {
                    win[1]++;
                }
                else if (mao[i][1] == 4) {
                    win[1]++;
                }
                else{
                    win[0]++;
                }
            }
            else if (mao[i][0] == 1) {
                if (mao[i][1] == 0) {
                    win[1]++;
                }
                else if (mao[i][1] == 4) {
                    win[1]++;
                }
                else{
                    win[0]++;
                }
            }
            else if (mao[i][0] == 2) {
                if (mao[i][1] == 0) {
                    win[1]++;
                }
                else if (mao[i][1] == 1) {
                    win[1]++;
                }
                else{
                    win[0]++;
                }
            }
            else if (mao[i][0] == 3) {
                if (mao[i][1] == 1) {
                    win[1]++;
                }
                else if (mao[i][1] == 2) {
                    win[1]++;
                }
                else{
                    win[0]++;
                }
            }
            else {
                if (mao[i][1] == 3) {
                    win[1]++;
                }
                else if (mao[i][1] == 2) {
                    win[1]++;
                }
                else{
                    win[0]++;
                }
            }
        }
        if (win[0] < win[1]){
            System.out.println("xerxes");
        }
        else{
            System.out.println("dario");
        }
    }
}
