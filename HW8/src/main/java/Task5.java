import java.util.Scanner;

public class Task5 { //Write program which print out next image using loops
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the size of the pyramid pattern");
        int x = in.nextInt();
        pyramidPatter(x);
        System.out.println();
    }
    private static void pyramidPatter(int x){
        int i,k;
        for ( i=0; i<x; i++) {
            for ( k=x-i; k>1; k--) {
                System.out.print(" ");
            }
            for ( k=0; k<=i; k++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
}
}



