import org.testng.annotations.*;

public class Annotation {
    @BeforeClass
    void beforClass() {
        System.out.println("This will execute before the class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("This will execute after the class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will execute before every testcase");

    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will execute after every testcase");
    }

    @Test
    void test1() {
        System.out.println("This is test1..");
    }

    @Test
    void test2() {
        System.out.println("This is test2..");
    }


}
