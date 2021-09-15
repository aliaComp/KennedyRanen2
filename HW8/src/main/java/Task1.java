public class Task1 { //Euler number
    public static void main(String[] args) {

        System.out.println(Euler(100000));

    }

    private static double Factorial(int base) {
        double result = 1;

        if(base == 0) {
            return 1;
        }

        for (int i = 1; i <= base; i++) {
            result *= i;
        }

        return result;
    }

    private static double Euler(int base) {
        double result = 0;

        for (int i = 0; i <= base; i++) {
            result += 1 / Factorial(i);
        }

        return result;
    }
}



