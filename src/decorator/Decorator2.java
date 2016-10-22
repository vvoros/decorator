package decorator;

public class Decorator2 extends ComponentDecorator {

  public Decorator2(Component component) {
    super(component);
  }

  @Override
  public String getMessage() {
    String message = super.getMessage();
    return String.format("decorator2: %s", message);
  }

}
