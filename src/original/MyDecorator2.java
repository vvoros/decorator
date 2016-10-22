package original;

public class MyDecorator2 implements MyDecorator {

  @Override
  public void decorator1() {
  }

  @Override
  public String decorator2(String arg0) {
    return String.format("my decorator2: %s", arg0);
  }

}
