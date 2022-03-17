package t;

import org.testng.annotations.*;

public class Annotation_2 {
    @DataProvider(name = "third_set")
    public Object[][] getData_2() {
        return new Object[][]{{"1", "2"}};
    }

    @DataProvider(name = "fourth_set")
    public Object[][] getData_3() {
        return new Object[][]{{"three", "four"}, {"true", "false"}};
    }

    @BeforeClass(groups = {"t"})
    public void bClass() {
        System.out.println("Before Class");
    }

    @Test(invocationCount = 2, groups = {"t"})
    public void test_1() {
        System.out.println("Test");
    }


    @Test(dataProvider = "third_set", groups = {"m"})
    public void test_2(String param_1, String param_2) {
        System.out.println("Test");
        System.out.println("Test data: " + param_1 + "," + param_2);
    }

    @AfterMethod(groups = {"m"})
    public void bTest() {
        System.out.println("After Method");
    }

    @Test(dataProvider = "fourth_set", groups = {"l"})
    public void test_3(String param_1, String param_2) {
        System.out.println("Test");
        System.out.println("Test data: " + param_1 + "," + param_2);
    }

    @AfterClass(groups = {"l"})
    public void aClass() {
        System.out.println("After Class");
    }

}
