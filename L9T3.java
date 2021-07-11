/*Посчитать результат выражений. Между числами могут быть
слова только "plus" and "minus"
String s1 = "1 plus 5";
String s2 = "6 minus 5";
String s3 = "8 plus 10";
String s4 = "16 minus 5";
Результат вывести на консоль в виде:
“1 plus 5 = 6”
*/

import java.io.IOException;
public class L9T3 {
    public static void main (String[] args) throws IOException {

        String s1 = "1 plus 5";
        String s2 = "6 minus 5";
        String s3 = "8 plus 10";
        String s4 = "16 minus 5";

        L9T3.calculation(s1);
        L9T3.calculation(s2);
        L9T3.calculation(s3);
        L9T3.calculation(s4);
    }
        public static void calculation (String str) throws IOException {

        String[] words = str.split(" ");
        String firstNum = words[0];
        String lastNum = words[words.length-1];
        int firstNumber = Integer.parseInt (firstNum);
        int lastNumber = Integer.parseInt (lastNum);

        String arValue = words[1];
        if (arValue.equals("plus")){
            int result = firstNumber + lastNumber;
            System.out.println(str + " = " + result);
        } else {
            int result1 = firstNumber - lastNumber;
            System.out.println(str + " = " + result1);
            } }}

