package decorator;

import baseclass.SomeClass;

public class Component extends SomeClass {

  public Component() {
  }

  public Component(String message) {
    super(message);
  }

  @Override
  public int multiply(int inp1, int inp2) {
    return super.multiply(inp1, inp2);
  }

  @Override
  public String getMessage() {
    return super.getMessage();
  }

}
