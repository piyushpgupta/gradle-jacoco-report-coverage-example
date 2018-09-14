package example;

import org.junit.Test;

public class GreetingTest {
  @Test
  public void test() {
    new Greeting().coveredByUnitTest();
  }
  @Test
  public void test2() {
    new Greeting().notCoveredByUnitTest2();
  }
  @Test
  public void test3() {
    new Greeting().notCoveredByUnitTest();
  }
  @Test
  public void test4() {
    new Greeting().notCoveredByUnitTest3();
  }
}
