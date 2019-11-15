import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by estebanparra on 4/21/19.
 */
public class MathTest {
////By default Maven uses the following naming conventions when looking for tests to run:
//    Test* ,  *Test , *TestCase
//    Therefore, something like test1 , testmethod would not be recognized

    @Test
    public void addTest() throws Exception {
        Math tester = new Math(); // MyClass is tested

        // assert statements

        assertEquals("10 + 0 must be 10", 10.0, tester.add(10.0, 0.0), 0.0);
        assertEquals("10 + 0 must be 10",0.0, tester.add(10.0, -10.0), 0.0);

    }

    @Test
    public void multiplyTest() throws Exception {
        Math tester = new Math();

        assertEquals(" 10.0 * 2.0 must be 20.0 ", 20.0, tester.multiply(10.0, 2.0));
        assertEquals(" 10.0 * 0.5 must be 5.0 ",5.0, tester.multiply(10.0, 0.5));

    }

//    @Test
//    public void divisionTest() throws Exception {
//        Math tester = new Math();
//
//        //assertEquals(" 10.0 / 0 must return exception ", , tester.divide(10.0, 0), 0.1);
//        assertEquals(5.0, tester.divide(10.0, 0.5), 0.1, " 10.0 / 0.5 must be 200 ");
//        assertEquals(5.0, tester.divide(10.0, 3), 0.1, " 10.0 / 3 must be 200 ");
//
//    }
//
//    @Test
//    public void divideByZeroTest() throws Exception{
//        Math tester = new Math();
//        Exception exception = assertThrows(ArithmeticException.class, () ->
//                tester.divide(1, 0));
//        assertEquals("/ by zero", exception.getMessage());
//    }


}
