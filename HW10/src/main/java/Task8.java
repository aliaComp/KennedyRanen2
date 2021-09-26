public class Task8 {//Создать два массива A и B из 5 элементов.

    // Создать третий массив C из 10 элементов,
    // в который копируются элементы из первого и второго массива поочередно
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 6);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int[] b = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 6);
            System.out.print(b[i] + " ");
        }
        System.out.println();

        int indexA = 0;
        int indexB = 0;
        int[] c = new int[10];
        for (int i = 0; i < c.length;){
            if (indexA < a.length) {
                c[i] = a[indexA];
                indexA++;
                i++;
            }
            if (indexB < b.length) {
                c[i] = b[indexB];
                indexB++;
                i++;
            }
        }
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
}

