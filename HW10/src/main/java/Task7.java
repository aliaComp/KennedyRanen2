public class Task7 {//Создать массив из 10 целых случайных чисел. Поменять местами соседние элементы массива.

    public static void main(String[] args) {
        int[] arra = new int[10];
        for (int i = 0; i < arra.length; i++) {
            arra[i] = (int) (Math.random() * 11);
            System.out.print(arra[i] + " ");
        } System.out.println();


        for (int i = 0; i < arra.length -1; i += 2){
            int m = arra[i+1];
            arra[i+1] = arra[i];
            arra[i] = m;


            System.out.print(arra[i] + " " + arra[i + 1] + " ");
        }

    }

}



