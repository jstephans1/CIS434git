package test;

import org.junit.*;

public class grouptest {
    @Test
    public void DivideTest()
    {
        Assert.assertThrows(java.lang.ArithmeticException.class, () -> group.divide(4, 0));
        Assert.assertThrows(java.lang.ArithmeticException.class, () -> group.divide(5, 3));
        Assert.assertEquals("Test failed", 2, group.divide(4, 2));
        Assert.assertEquals("Test failed", 4, group.divide(12, 3));
    }

    @Test
    public void MultiplyTest()
    {
        Assert.assertEquals("Test failed", 0, group.multiply(0, 0));
        Assert.assertEquals("Test failed", 8, group.multiply(4, 2));
        Assert.assertEquals("Test failed", -8, group.multiply(-4, 2));
        Assert.assertEquals("Test failed", 8, group.multiply(-4, -2));
    }

    @Test
    public void PowerTest()
    {
        Assert.assertThrows(java.lang.IllegalArgumentException.class, () -> group.power(4, -2));
        Assert.assertEquals("Test failed", 16, group.power(2, 4));
        Assert.assertEquals("Test failed", 1, group.power(2, 0));
    }
}