/*Дана строка:
“It's the possibility of having a dream come true that makes life interesting.”
Необходимо:
а) перевести в верхний регистр все буквы в строке. Вывести
результат в консоль
б) перевести в нижний регистр все буквы в строке. Вывести
результат в консоль
в) каждое слово должно начинаться с большой буквы. Вывести
результат в консоль.
Note: для решения задачи использовать методы класса String*/

import java.io.IOException;

public class L9T5 {

    public static void main(String[] args) throws IOException {
        String myString = new String("It's the possibility of having a dream come true that makes life interesting.");
        String myUpperString = myString.toUpperCase();
        System.out.println("Верхний регистр - " + myUpperString);

        String myLowerString = myString.toLowerCase();
        System.out.println("Нижний регистр - " + myLowerString);
    }
}


