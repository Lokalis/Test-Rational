import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.runners.Parameterized.*;


import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RationalTestDivide {

    @Parameter()
    public String result;

    @Parameter(1)
    public int f_num;

    @Parameter(2)
    public int f_den;

    @Parameter(3)
    public int s_num;

    @Parameter(4)
    public int s_den;

    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { {"1/1",1,2,1,2},{"-1/1",-1,2,1,2},{"1/1",-1,2,-1,2} };
        return Arrays.asList(data);
    }

    @Test
    public void test_divide(){
        Rational first=new Rational(f_num,f_den);
        Rational second = new Rational(s_num,s_den).divide(first);
        assertEquals("Wrong divide",result,second.toString());
    }

}