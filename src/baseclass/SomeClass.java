package baseclass;

public class SomeClass {

  private String message;

  public SomeClass() {
  }

  public SomeClass(String message) {
    this.message = message;
  }

  public int multiply(int inp1, int inp2) {
    return inp1 * inp2;
  }

  public String getMessage() {
    return message;
  }

}
