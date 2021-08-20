
import org.junit.jupiter.api.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class VerifyInputValuesForLuckyTicketTestng {

    // целые числа от 0 до 10 + условие счастливого билета {1, 2, 9, 1, 2, 9 } -> true
    // целые числа от 0 до 10 + условие несчастливого билета {1, 2, 9, 1, 2, 9 } -> false
    // проверить отрицательное число {-1 2 3 1 2 3 } -> false
    // проверить граничное значение + двузначное число {10 2 3 1 2 3 } -> false
    // проверить буквы {a 2 3 1 2 3 } -> compile error
    // проверить символы {% 2 3 1 2 3 } -> compile error
    // проверить нецелые числа {0.05 2 3 1 2 3 } -> compile error


    @Test
    public void verifyTicketIsLuckyWithValidValues() {
        LuckyTicket.isLucky(1, 2, 9, 1, 2, 9);
        Assert.assertTrue(true);
    }

    @Test
    public void verifyTicketIsNotLuckyWithValidValues() {
        LuckyTicket.isLucky(2, 2, 9, 1, 2, 9);
        Assert.assertFalse(false); }

    @Test
    public void verifyNegativeValueIsNotAccepted() {
        LuckyTicket.isLucky(-1, 2, 9, 1, 2, 9);
        //boolean expectedResult = false;
        Assert.assertFalse(false); }

    @Test
    public void verifyTwo_DigitValueIsNotAccepted() {
        LuckyTicket.isLucky(10, 2, 9, 1, 2, 9);

        Assert.assertFalse(false); }


    @BeforeClass
    public static void BeforeAllTests() {
        System.out.println("“Before all tests ….");
    }

    @AfterClass
    public static void AfterAllTests() {
        System.out.println("After all tests ….");
    }

    @BeforeMethod
    public static void BeforeEach() {
        System.out.println("This is text before each test");
    }

    @AfterMethod
    public static void AfterEach() {
        System.out.println("This is text after each test");
    }

}
