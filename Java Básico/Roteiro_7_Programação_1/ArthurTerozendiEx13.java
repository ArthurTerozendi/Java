import java.util.Scanner;

public class ArthurTerozendiEx13 {
    public static void main(String[] args) {
        int bin = 0, dec, aux = 0;
        Scanner in = new Scanner(System.in);
        dec =  in.nextInt();
        bin  = dec2bin(bin, dec, aux);
        /*while(dec > 0){
            bin += dec%2 * Math.pow(10, aux);
            dec /= 2;
            aux++;
        }*/
        System.out.println(bin);
    }
    public static int dec2bin(int b, int d, int aux){
        if (d <= 0) {
            return b;
        }
        else {
            b += d%2 * Math.pow(10,aux);
            d /= 2;
            aux++;
            return dec2bin(b,d,aux);
        }
    }
}
