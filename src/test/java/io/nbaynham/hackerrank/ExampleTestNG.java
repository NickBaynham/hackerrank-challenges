package io.nbaynham.hackerrank;

import org.testng.annotations.*;

public class ExampleTestNG {

    @BeforeTest
    public void init() {
        System.out.println("Before Test Executes");
    }

    @Test
    public void test() {
        System.out.println("I'm a Test Running...");
    }

    @AfterTest
    public void after() {
        System.out.println("This is printed after the test is done.");
    }
}
