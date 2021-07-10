

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class L8T2 {

    public static void main(String[] args) throws IOException {

        Integer[] array = {-111, 12, 9, -40, 6, 8,};

        System.out.println(Arrays.toString(array));
        L8T2.average(array);
        L8T2.totalSum(array);
        L8T2.quantityBetweenMaxMin(array);

    }

    public static void average(Integer[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        int ave = sum / a.length;
        System.out.println("Среднее арифметическое = " + ave);
    }

    public static void totalSum(Integer[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма всех элементов = " + sum);
    }

    public static void quantityBetweenMaxMin(Integer[] arr) {

        int min = arr[arr.length - 1];
        int max = arr[0];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        //System.out.println(max);
        //System.out.println(min);
        List<Integer> arrayList = Arrays.asList(arr);
        result = arrayList.indexOf(max) - arrayList.indexOf(min);

        if (result == 1) {
            System.out.println("Максимальное и минимальное значения находятся рядом. Количество элементов между максимальным и минимальным элементом равно 0");
        } else
            System.out.println("Количество элементов между максимальным и минимальным элементом :" + (Math.abs(result) - 1));
    }
}