public class Task4 {//Создать массив из 20 случайных чисел в диапазоне от 0 до 200.
    // Определить количество одноразрядных, двухразрядных и трёхразрядных чисел в процентном отношении.
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201);
            System.out.print(array[i] + " ");
        }
        float oneDigitnum = 0;
        float twoDigitnum = 0;
        float threeDigitnum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 9) {
                oneDigitnum++;
            } else if (array[i] > 9 && array[i] <= 99) {
                twoDigitnum++;
            } else {
                threeDigitnum++;
            }
        }
        float percOneDigitnum = (oneDigitnum /array.length) * 100;
        float percTwoDigitnum = (twoDigitnum / array.length) * 100;
        float percThreeDigitnum = (threeDigitnum / array.length) * 100;
        System.out.print("\nOne digit number percent:" + percOneDigitnum + "%");
        System.out.print("\nTwo digit number percent: " + percTwoDigitnum + "%");
        System.out.print("\nThree digit number percent: " + percThreeDigitnum + "%");


    }
}
