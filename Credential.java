import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Credential {

    public static boolean method() throws WrongLoginExeption, WrongPasswordExeption, IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите логин длиной до 20 символов");
        String login = bufferedReader.readLine();
        System.out.println("login: " + login);

        BufferedReader bufferedReaderPassword = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите пароль длиной до 20 символов");
        String password = bufferedReaderPassword.readLine();
        System.out.println("password: " + password);

        BufferedReader bufferedReaderConfirmPassword = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Повторите пароль");
        String ConfirmPassword = bufferedReaderConfirmPassword.readLine();
        System.out.println("password confirm: " + ConfirmPassword);

        String numRegex = ".*[0-9].*";
        String alphaRegex = ".*[a-zA-Z].*";
        String underlining = ".*[_].*";
        String[] symbols = {"^", "!", "@", "#", "$", "%", "^", "&", "*", "(", "<", ">", ".", "~", "?", "|", "!", "/", ";", ":", "`"};

        String[] login1 = login.split("");
        String[] password1 = password.split("");

        for (int i = 0; i < symbols.length; i++) {
            if (login.contains(symbols[i]) ||(login1.length >= 20) || !login.matches(numRegex) || !login.matches(alphaRegex) || !login.matches(underlining)) {
                throw new WrongLoginExeption("Логин не верный");
            } }

        for (int n = 0; n < symbols.length; n++) {
            if (password.contains(symbols[n]) || !(password.equals(ConfirmPassword)) || (password1.length >= 20) ||
            !password.matches(numRegex) || !password.matches(alphaRegex) || !password.matches(underlining)) {
                throw new WrongPasswordExeption("Пароль неверный");
            }
        }if (password.matches(numRegex) && password.matches(alphaRegex) && password.matches(underlining) &&
                login.matches(numRegex) && login.matches(alphaRegex) && login.matches(underlining)) {
            System.out.println("Пароль и логин верные");
            return true;
        } else  System.out.println("Пароль и логин неверные");
    return false;
    }

    public static void main(String[] args) throws Exception{

        try {
            method();
        } catch (WrongLoginExeption ex) {
            System.out.println("Неверный логин");
            ex.getCause();
        } catch (WrongPasswordExeption ex) {
            System.out.println("Неверный пароль");
            ex.getCause();
    }}}



