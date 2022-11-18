package unit.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeAfterTestExecution {
   @BeforeTest (groups = {"RegressionTests"})
    public void methodBeforeTest (){
        System.out.println("I'm before test");
    }
    @AfterTest (groups = {"RegressionTests"})
    public void methodAfterTest (){
        System.out.println("I'm after test");
    }
}
