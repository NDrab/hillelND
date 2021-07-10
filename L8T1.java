
public class L8T1 {
    public static void main(String[] args) {
        int [] array = {4,8,8,4,7,9};
        int sum1 = array[0]+array[1]+array[2];
        int sum2 = array[3]+array[4]+array[5];
        if (sum1 == sum2) {
            System.out.println("Билет счастливый:true");
        }else
            System.out.println("Билет не счастливый");
        }
    }
// по условию задачи  else с выводом на экран сообщения не обязательно, но я решила вывести для удобства
