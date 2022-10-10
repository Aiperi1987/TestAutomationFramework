package cucumberSelenium.JavaFaker.junit5;

import org.junit.jupiter.api.*;

public class JunitDemo {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("This is before annotation");
    }

    @BeforeEach
    public void beforeEachAnnotation() {
        System.out.println("This is each annotation");
    }

    @AfterEach
    public void afterEachAnnotation() {
        System.out.println("This is after each annotation");
}

    @AfterAll
    public static void afterAllAnnotation() {
    System.out.println("This is after all annotation");
}
    @Test
    public void test1(){
    Assertions.assertTrue(true);
        System.out.println("This is test 1");

    }
}
