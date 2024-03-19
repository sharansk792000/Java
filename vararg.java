/*
 * var-arg known as variable number of argument methods
 * by using this concept we can pass any number of parameters including zero
 * parameter to the calling method
 */
class vararg {
  void add(int... a) {
    int add = 0;
    for (int z : a)
      add = add + z;
    System.out.println(add);
  }
}

class show {
  public static void main(String[] args) {
    vararg t = new vararg();
    t.add(10);
    t.add(90, 21);
  }
}