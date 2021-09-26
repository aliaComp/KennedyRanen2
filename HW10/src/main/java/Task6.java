public class Task6 { //Создать массив из 10 целых случайных чисел.
    // Изменить порядок следования элементов массива на противоположный
    // (1-й элемент меняется с 10-м, 2-й элемент с 9-м и т.д.).
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + " ");

        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
