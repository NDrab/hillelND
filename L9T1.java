
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L9T1 {
    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите фамилию студента");
        String surname = bufferedReader.readLine();


        System.out.println("Укажите оценку студента");
        String number = bufferedReader.readLine();
        int grade = Integer.parseInt(number);

        System.out.println("Укажите предмет");
        String subject = bufferedReader.readLine();


        L9T1.studentInfo(surname,grade,subject);
    }

   public static void studentInfo (String surname, int grade, String subject  ) throws IOException {

       String info = String.format("Студент %s получил %d по %s", surname, grade, subject);
       System.out.println(info);
   }
}




