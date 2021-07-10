import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L8T3 {
    public static void main (String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Укажите длину массива");
            String number = bufferedReader.readLine();
            int length = Integer.parseInt(number);
        int array []=new int [length];
        System.out.println("Длина массива:" +length);

            for (int i = 0; i <length; i++){
                BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Присвойте число элементу массива");
                String num1 = bufferedReader.readLine();
                int number1 = Integer.parseInt(num1);
                array [i]= number1;
        }
        int min =  array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Минимальное число: "+min);
        }
    }
