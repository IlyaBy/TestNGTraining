package unit.test;

import org.testng.annotations.Test;

public class GeneralFunctionsCalcTest extends BeforeAfterTestExecution {
   @Test (groups = {"UnitTests"})
    public void checkFunction1 (){
        System.out.println("Function1");
    }
    @Test (groups = {"RegressionTests"})
    public void checkFunction2 (){
        System.out.println("Function2");
    }
}
