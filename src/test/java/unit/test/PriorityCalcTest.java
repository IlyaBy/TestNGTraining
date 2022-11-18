package unit.test;

import calc.counter.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityCalcTest extends BeforeAfterTestExecution {
    private final Calculator calculator=new Calculator();
    private final double FIRSTNUM = 10;
    private final double SECONDNUM = 5;

    @Test (groups = {"UnitTests"})
    public void checkAdd () {
        double expectedResult = FIRSTNUM + SECONDNUM;
        double actualResult  = calculator.add(FIRSTNUM,SECONDNUM);
        Assert.assertEquals(expectedResult,actualResult,"The result is not correct for adding");
    }
    @Test (groups = {"RegressionTests"})
    public void checkFailMultiplication () {
        double expectedResult = FIRSTNUM * SECONDNUM;
        double actualResult  = calculator.failMultiplyMethod(FIRSTNUM,SECONDNUM);
        Assert.assertEquals(expectedResult,actualResult,"The result is not correct for multiplication");
    }

}
