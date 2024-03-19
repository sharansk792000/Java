/*
 * We couldnt change return type of overriden method,
 * but in new concept in java called covarient
 * we can change return types for overriden method
 */
class covariant {
  covariant show() {
    System.out.println("Learn Coding");
    return new covariant();
    // return this; // this --> new A();
    // this refers to the current object
  }
}

class test1 extends covariant {
  @Override
  test1 show() {
    super.show();
    System.out.println("please die");
    return this;
  }
}

class printbro {
  public static void main(String[] args) {
    test1 t = new test1();
    t.show();
  }
}