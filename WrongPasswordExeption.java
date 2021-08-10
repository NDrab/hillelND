import java.io.IOException;

public class WrongPasswordExeption extends Exception {
    WrongPasswordExeption(String s)
    {
        System.out.println(s);
    }
}
