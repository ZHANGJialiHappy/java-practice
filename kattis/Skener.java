import java.util.Scanner;

public class Skener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int zr = sc.nextInt();
        int zc = sc.nextInt();
        String[][] lines = new String[r][c];
        for (int i = 0; i < r; i++) {
            String row = sc.next();
            for (int j = 0; j < c; j++) {
                lines[i][j] = row.substring(j, j + 1);
            }
        }

        for (String[] row : lines) {
            for (int j = 0; j < zr; j++) {
                for (String column : row) {
                    for (int i = 0; i < zc; i++) {
                        System.out.print(column);
                    }
                }
                System.out.println();

            }
        }
    }
}
