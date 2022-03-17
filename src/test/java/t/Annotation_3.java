package t;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Annotation_3 {
    @Test
    public void Test(){}
    @AfterClass
    public void aClass() {System.out.println("After Class");}
    @AfterTest
    public void aTest() {System.out.println("After Test");}
}
