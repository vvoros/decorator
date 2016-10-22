package original;

import java.util.ArrayList;
import java.util.List;

import baseclass.SomeClass;

public class MyClass extends SomeClass {

  List<MyDecorator> decorators;

  public MyClass(String message) {
    super(message);
    decorators = new ArrayList<>();
  }

  public void registerDecorator(MyDecorator decorator) {
    decorators.add(decorator);
  }

  @Override
  public int multiply(int inp1, int inp2) {
    runMultiplyDecorators();
    return super.multiply(inp1, inp2);
  }

  private void runMultiplyDecorators() {
    for (MyDecorator myDecorator : decorators) {
      myDecorator.decorator1();
    }
  }

  @Override
  public String getMessage() {
    String message = super.getMessage();
    return runMessageDecorators(message);
  }

  private String runMessageDecorators(String message) {
    StringBuilder sb = new StringBuilder();
    for (MyDecorator myDecorator : decorators) {
      String myMessage = myDecorator.decorator2(message);
      if (myMessage != null) {
        sb.append(myMessage);
      }
    }
    return sb.toString();
  }

}
