package example;

public class Greeting {
  static final String HELLO="Hello World";
  public void coveredByUnitTest() {
   System.out.println(HELLO);
  }

  public void notCoveredByUnitTest() {
   System.out.println(HELLO);
  }
  public void notCoveredByUnitTest2() {
   System.out.println(HELLO);
  }
}
