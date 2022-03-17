package t;

import org.testng.annotations.*;

public class Annotation_1 {
    @DataProvider(name = "first_set")
    public Object[][] getData() {
        return new Object[][]{{"0", "0"}, {"1", "2"}};
    }

    @DataProvider(name = "second_set")
    public Object[][] getData_1() {
        return new Object[][]{{"three", "four"}, {"true", "false"}};
    }

    @BeforeSuite
    public void bSuite() {
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void bClass() {
        System.out.println("Before Class");
    }

    @Test(dataProvider = "first_set")
    public void test_1(String param_1, String param_2) {
        System.out.println("Test");
        if (!param_1.equals("0"))
            System.out.println("Test data: " + param_1 + " " + param_2);
    }

    @AfterMethod
    public void bTest() {
        System.out.println("After Method");
    }


    @Test
    public void test_2() {
    }


    @Test(dataProvider = "second_set")
    public void test_3(String param_1, String param_2) {
        System.out.println("Test");
        System.out.println("Test data: " + param_1 + " " + param_2);
    }

}









