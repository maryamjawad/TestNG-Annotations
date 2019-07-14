import org.testng.annotations.*;

public class Testcase {
    @BeforeClass
    void beforClass() {
        System.out.println("This will execute before the class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("This will execute after the class");
    }

    @BeforeMethod
    void beforMethod() {
        System.out.println("This will execute before every testcase");

    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will execute after every testcase");
    }

    @Test
    void test3() {
        System.out.println("This is test3..");
    }

    @Test
    void test4() {
        System.out.println("This is test4..");
    }


}
