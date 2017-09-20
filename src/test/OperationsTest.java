import main.math_operations.Operations;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bohdanastavriianova on 09/08/2017.
 */
public class OperationsTest {
    Operations operations = new Operations();

    @Test
    public void sum() {
        Assert.assertEquals(operations.sum(5,10), 15);
    }

    @Test
    public void substraction() {
        Assert.assertEquals(operations.substraction(4, 2), 2);
    }

    @Test
    public void multiply() {
        Assert.assertEquals(operations.multiply(2, 6), 12);
    }

    @Test
    public void modulus() {
        Assert.assertEquals(operations.modulus(5, 4), 1);
    }

    @Test
    public void division() {
        Assert.assertEquals(operations.division(12, 6), 2, 0.01);
    }

    @Test
    public void increment() {
        Assert.assertEquals(operations.increment(11), 12);
    }

    @Test
    public void equality() {
        Assert.assertTrue(operations.equality(6, 6));
    }

}