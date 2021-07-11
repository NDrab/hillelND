/*Условие задачи: ввести 2 слова с клавиатуры, состоящие из
четного числа букв. Получить слово состоящее из первой половины
первого слова и второй половины второго слова. Вывести
полученное слово на экран
String a = “1122”;
String b = “3344”;
”Result: 1144”
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L9T2 {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое слово, состоящие из четного числа букв");
        String firstWord = bufferedReader.readLine();
        System.out.println("Введите второе слово, состоящие из четного числа букв");
        String secondWord = bufferedReader.readLine();

        char [] result1 = firstWord.toCharArray();
        char [] result2 = secondWord.toCharArray();

        char a = firstWord.charAt(0);
        char b = firstWord.charAt(1);
        char c = secondWord.charAt(secondWord.length()-2);
        char d = secondWord.charAt(secondWord.length()-1);

        System.out.println(String.format(" %c %c %c %c ", a, b, c, d));
    }
}
