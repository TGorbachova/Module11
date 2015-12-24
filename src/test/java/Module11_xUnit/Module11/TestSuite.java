package Module11_xUnit.Module11;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Tetiana_Horbachova on 10/21/2015.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({SortToysTest.class, CreateRoomTest.class})
public class TestSuite {

    @BeforeClass
     public static void startTesting(){
        System.out.println("Start testing");
    }


    }
