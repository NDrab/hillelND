
/*4) Создать массив целых чисел. Отсортировать массив по
убыванию(не использовать метод Arrays.sort()).
Вывести массив до сортировки и после сортировки.
Массив после сортировки вывести тремя способами:
а) с помощью цикла for
b) с помощью цикла foreach
c) с помощью метода из класса Arrays*/

import java.util.Arrays;
import java.util.Collections;

public class L8T4 {
    public static void main(String[] args) {
    int [] array = {11, 2, 5, 6, 4, 0};
        System.out.println("Массив до сортировки: " + Arrays.toString(array));


    //c помощью цикла for
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j < array.length - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        int s = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = s;
                    } }System.out.print(array[i] + "  ");
            }System.out.println(" ");

    //с помощью цикла foreach
               for (int a : array) {
                   System.out.print(a + "  ");
                }System.out.println(" ");


    //с помощью метода из класса Arrays
        Arrays.sort(array);
        for (int i = array.length-1; i >= 0; i--)
            System.out.print(array[i] + "  ");
    }
}

