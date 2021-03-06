package Module11_xUnit.Module11;

import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * Created by Tetiana_Horbachova on 10/21/2015.
 */

public class TestRunner {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(SortToysTest.class, CreateRoomTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
       /* Result result = JUnitCore.runClasses(SortToysTest.class, CreateRoomTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }*/
}
