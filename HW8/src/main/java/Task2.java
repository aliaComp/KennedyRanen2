public class Task2 {//Write a program called Tribonacci to print the first 20 Tribonacci number

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 1;
        int d = a + b+ c;
        int n = 20;
        System.out.print(a+ " "+b + " " + c);
        for (int i = 4; i <= n ; i++){
            System.out.print(" " +d);
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
        System.out.println();

    }
    }
