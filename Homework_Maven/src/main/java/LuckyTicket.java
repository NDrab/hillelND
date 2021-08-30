public class LuckyTicket {

        public static boolean isLucky(int numOne, int numTwo,int numThree,int numFour,int numFive,int numSix) {

            int[] array = {numOne, numTwo, numThree, numFour, numFive, numSix};
            boolean result = array[0] + array[1] + array[2] == array[3] + array[4] + array[5];
            if (numOne >= 0 && numOne <= 9 && numTwo >= 0 && numTwo <= 9 && numThree >= 0 && numThree <= 9 &&
                    numFour >= 0 && numFour <= 9 && numFive >= 0 && numFive <= 9 && numSix >= 0 && numSix <= 9 &&
                    result) {
                System.out.println("Билет счастливый " + result);
                return result;
            }
            if (!(numOne >= 0 && numOne <= 9 && numTwo >= 0 && numTwo <= 9 && numThree >= 0 && numThree <= 9 &&
                    numFour >= 0 && numFour <= 9 && numFive >= 0 && numFive <= 9 && numSix >= 0 && numSix <= 9)) {
                System.out.println("Вы ввели невалидное значение " + result);
                return false;
            }
            if (!result) {
                System.out.println("Билет не счастливый " + result);
            }return false;
        }

        public static void main (String [] args){
           isLucky(3,1,2,2,2,2);
        }}



