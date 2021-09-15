import java.util.Scanner;

public class Task3 { //4 programs called TriangularPatternX (X = A, B, C, D)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the size of the triangular patter");
        int x = in.nextInt();
        patternA(x);
        System.out.println("\n");
        patternB(x);
        System.out.println("\n");
        patternC(x);
        System.out.println("\n");
        patternD(x);
        System.out.println("\n");
    }

    private static void patternA(int x) {
        int i, k;
        for (i = 0; i < x; i++) {
            for (k = 0; k <= i; k++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }

    }

    private static void patternB(int x) {
        int i, k;
        for (i = 0; i < x; i++) {
            for (k = i; k < x; k++) {
                System.out.print("# ");
            }
            System.out.print("\n");
        }
    }

    private static void patternC(int x) {
        int i, k, j;
        for (i = x; i >= 1; i--) {
            for (j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();

        }
    }

    private static void patternD(int x) {
        int i, k;

        for (i = 0; i < x; i++) {
            for (k = 2 * (x - i); k >= 0; k--) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}






