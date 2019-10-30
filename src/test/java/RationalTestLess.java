import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.runners.Parameterized.*;


import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RationalTestLess {

    @Parameter()
    public int f_num;

    @Parameter(1)
    public int f_den;

    @Parameter(2)
    public int s_num;

    @Parameter(3)
    public int s_den;

    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {5,2,1,2},{1,2,1,5},{1,2,2,5} };
        return Arrays.asList(data);
    }

    @Test
    public void test_less(){
        Rational first =new Rational(f_num,f_den);
        Rational second = new Rational(s_num,s_den);
        boolean result=second.less(first);
        assertEquals("Incorrect comparison less",true,result);
    }
}