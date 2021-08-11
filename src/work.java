import java.util.Arrays;
public class work {
        public static void main(String[] args) {
            System.out.println("Задание 1");
            int [] array = {0, 0, 0, 1, 1, 1, 0, 1, 0, 1};
            System.out.println(Arrays.toString(array));
            Changemassiv(array);
            System.out.println(Arrays.toString(array));

            System.out.println("Задание 2");
            int [] newArray_1 = new int[100];
            System.out.println(Arrays.toString(newArray_1));
            Fillingmassiv(newArray_1);
            System.out.println(Arrays.toString(newArray_1));

            System.out.println("Задание 3");
            int[] newArray_2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            System.out.println(Arrays.toString(newArray_2));
            massivex2(newArray_2);
            System.out.println(Arrays.toString(newArray_2));

            System.out.println("Задание 4");
            int[][] newArray_4 = new int[4][4];
            System.out.println(Arrays.toString(newArray_4));
            System.out.println(Arrays.toString(newArray_4));

            System.out.println("Задание 5");
            int initialValue = 30;
            int size = 10;
            int[] newArray_3 = twoarguments(initialValue, size);
            System.out.println(Arrays.toString(newArray_3));

            System.out.println("Задание 6");
            int[] Array_4 = { 5, 10, 7, 20, 0 };
            System.out.println(Arrays.toString(Array_4));
            print(Array_4);
        }
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
        // и условия заменить 0 на 1, 1 на 0
        public static void Changemassiv (int [] inputArray){
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] == 1){
                    inputArray [i] = 0;
                }
                else {inputArray[i] = 1;}}}

        //2. Задать пустой целочисленный массив длиной 100. С помощью
        // цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        public static void Fillingmassiv (int[] r) {
            for (int i=0; i < r.length; i++) {
                r[i] = (i + 1);}}

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти
        // по нему циклом, и числа меньшие 6 умножить на 2;
        public static void massivex2 (int[] inputArray){
            for (int d = 0; d < inputArray.length; d++){
                inputArray[d] = inputArray[d] < 6 ? inputArray[d]*2 : inputArray[d];}}

        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему
        // принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        public static void Fillingmassiv(int[][] inputArray){
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray.length; j++) {
                    System.out.println();
                }}}

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого
        // равна initialValue;
        public static int[] twoarguments(int initialValue, int len){
            int[] result = new int[len];
            for (int i = 0; i < result.length; i++){
                result[i] = initialValue;}
            return result;}
        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        public static void print(int[] inputArray)
        {
            int min = inputArray[0];
            int max = inputArray[0];
            for (int i = 1; i < inputArray.length; i++)
            {
                if (min > inputArray[i])
                {
                    min = inputArray[i];
                }

                if (max < inputArray[i])
                {
                    max = inputArray[i];
                }
            }

            System.out.println("Минимальное число: " + min);
            System.out.println("Максимальное число: " + max);
        }

    }
