import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
    int a;
    int b;

    @Before
    public void setUp() {
        a = 6;
        b = 3;
    }
    @Test
    public void testSum() {
        int result = 9;
        Assert.assertEquals(9, Calc.sum(a,b));
    }
    @Test
    public void testSub(){
        int result = 3;
        Assert.assertEquals(3, Calc.sub(a,b));
    }
    @Test
    public void testMult(){
        int result  = 18;
        Assert.assertEquals(18, Calc.mult(a,b));
    }
    @Test
    public void testDiv(){
        int result = 2;
        Assert.assertEquals(2, Calc.div(a,b));
    }

}
