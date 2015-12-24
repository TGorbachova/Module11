package Module11_xUnit.Module11;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.runners.Parameterized.*;

/**
 * Created by Tetiana_Horbachova on 12/15/2015.
 */

@RunWith(Parameterized.class)
public class ParameterizedTest {

    @Parameters
    public static Collection<ArrayList<Toy>> data() {

       final ArrayList<Toy> toysOne = new ArrayList<Toy>();
        final ArrayList<Toy> toysOneExpected = new ArrayList<Toy>();
       final  ArrayList<Toy> toysTwo = new ArrayList<Toy>();
       final ArrayList<Toy> toysThree = new ArrayList<Toy>();


        return Arrays.asList(toysOne, toysTwo, toysThree);

    }



}
