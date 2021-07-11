/*4) Ввести 10 строк с консоли. Вывести на консоль те строки, длина
которых меньше средней.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class L9T4 {
    public static void main(String[] args) throws IOException {

        int i;
        String[] mas = new String[10];
        for (i = 0; i < mas.length; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку");
            String line = bufferedReader.readLine();
            mas[i] = line;
            }
            System.out.println(Arrays.toString(mas));

            int ave = (mas[0].length() + mas[1].length() + mas[2].length() + mas[3].length() + mas[4].length() + mas[5].length() + mas[6].length() + mas[7].length() + mas[8].length() + mas[9].length()) / 10;

        String average = String.format("Средняя длина сроки %s", ave);
        System.out.println(average);

        for (i=0;i<10;i++) {
            if (mas[i].length() < ave)
            System.out.println("Строка с длиной меньше средней: " + mas[i]);
        } }}



