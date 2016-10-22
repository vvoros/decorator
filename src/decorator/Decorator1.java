package decorator;

public class Decorator1 extends ComponentDecorator {

  public Decorator1(Component component) {
    super(component);
  }

  @Override
  public int multiply(int inp1, int inp2) {
    System.out.println("my decorator1");
    return super.multiply(inp1, inp2);
  }



}
