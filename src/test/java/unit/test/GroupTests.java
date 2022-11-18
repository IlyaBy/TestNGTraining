package unit.test;

import calc.counter.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTests {
    private final Calculator calculator=new Calculator();
    private final double FIRSTNUM = 10;
    private final double SECONDNUM = 5;

    @Test (groups = {"RegressionTests"})
    public void checkSubtract () {
        double expectedResult = FIRSTNUM - SECONDNUM;
        double actualResult  = calculator.subtract(FIRSTNUM,SECONDNUM);
        Assert.assertEquals(expectedResult,actualResult,"The result is not correct for subtraction");
    }
    @Test (groups = {"UnitTests"})
    public void checkDivision () {
        double expectedResult = FIRSTNUM / SECONDNUM;
        double actualResult  = calculator.divide(FIRSTNUM,SECONDNUM);
        Assert.assertEquals(expectedResult,actualResult,"The result is not correct for division");
    }
}
