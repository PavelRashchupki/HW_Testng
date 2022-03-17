package t;

import org.testng.annotations.*;

public class Annotation_4 {
    @BeforeTest
    public void bTest() {
        System.out.println("Before Test");
    }
    @Test
    public void test() {
        System.out.println("Test");
    }
    @AfterMethod
    public void aMethod() {
        System.out.println("After Method");
    }
    @AfterTest
    public void aTest() {
        System.out.println("After Test");
    }
    @AfterSuite
    public void aSuite() {
        System.out.println("After Suite");
    }
}
