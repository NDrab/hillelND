import java.io.IOException;

public class WrongLoginExeption extends Exception {
        WrongLoginExeption(String s)
        {
            System.out.println(s);
        }
    }

