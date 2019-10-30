import org.junit.Test;

import static org.junit.Assert.*;

public class RationalTestNotParametrize {

    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void test_reduce(){
        Rational result=new Rational(10,2);
        assertEquals("Wrong reduce","5/1",result.toString());
    }

    @Test
    public void test_equal_null(){
        Rational first =new Rational(1,2);
        Rational second =new Rational(1,2);
        assertEquals("Wrong equal with null",true,second.equals(first));
    }

    @Test(expected =ArithmeticException.class)
    public void testzero_denominator(){
        Rational standart= new Rational();
        standart.setDenominator(0);
    }
}