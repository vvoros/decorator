import baseclass.SomeClass;
import decorator.Component;
import decorator.Decorator1;
import decorator.Decorator2;
import original.MyClass;
import original.MyDecorator1;
import original.MyDecorator2;

public class Main {

  public static void main(String[] args) {

    SomeClass sc = new SomeClass("some message");

    System.out.println("-- SomeClass");
    System.out.println("Multiply: " + sc.multiply(3, 5));
    System.out.println("Message : " + sc.getMessage());


    MyClass mc = new MyClass("my message");

    mc.registerDecorator(new MyDecorator1());
    mc.registerDecorator(new MyDecorator2());

    System.out.println("-- MyClass");
    System.out.println("Multiply: " + mc.multiply(3, 5));
    System.out.println("Message : " + mc.getMessage());

    Component c = new Decorator1(new Decorator2(new Component("component")));

    System.out.println("-- Component Decorator");
    System.out.println("Multiply: " + c.multiply(3, 5));
    System.out.println("Message : " + c.getMessage());
  }

}
