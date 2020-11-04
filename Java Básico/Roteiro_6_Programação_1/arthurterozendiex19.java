import java.util.Scanner;

public class arthurterozendiex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l, c, x = 0, y = 0, x1 = 0, y1 = 0;
        boolean aux = false;
        l = in.nextInt();
        c = in.nextInt();
        String mapa[][] = new String[l][c];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = in.nextLine();
                in.hasNextLine();
            }
        }
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j].equals("o")) {
                    x = i;
                    y = j;
                }
            }
        }

        while (!aux == true) {
            if (mapa[x - 1][y].equals("H")) {
                if (x-1 != x1 && y != y1) {
                    x -= 1;
                }
            } else if (mapa[x][y - 1].equals("H")) {
                if (x != x1 && y-1 != y1) {
                    y -= 1;
                }
            } else if (mapa[x + 1][y].equals("H")) {
                if (x+1 != x1 && y != y1) {
                    x += 1;
                }
            } else if (mapa[x][y + 1].equals("H")) {
                if (x != x1 && y+1 != y1) {
                    y += 1;
                }
            }
            else{
                aux = true;
            }
            System.out.println(x + " " + y);
        }
    }
}
