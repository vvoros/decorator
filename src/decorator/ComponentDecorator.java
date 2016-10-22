package decorator;

public class ComponentDecorator extends Component {

  protected Component component;

  public ComponentDecorator(Component component) {
    this.component = component;
  }

  @Override
  public int multiply(int inp1, int inp2) {
    return this.component.multiply(inp1, inp2);
  }

  @Override
  public String getMessage() {
    return this.component.getMessage();
  }

}
