public class Task5 {// Создать массив из 20 целых случайных чисел в диапазоне от 0 до 100.

    // Определить и вывести на экран все простые числа из этого массива.
    public static void main(String[] args) {
        int[] albina = new int[20];
        for (int i = 0; i < albina.length; i++) {
            albina[i] = (int) (Math.random() * 98 + 2);
            System.out.print(albina[i] + " ");

        }


        for (int i = 0; i < albina.length; i++) {

            boolean isSimple = true;
            for (int m = 2; m < albina[i]; m++) {
                if (albina[i] == 2) {
                    break;
                }
                if (albina[i] % m == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.println();
                System.out.println("Simple numbers: " + albina[i]);

                }

            }
        }
    }


