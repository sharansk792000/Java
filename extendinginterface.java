/*here for example
 the test class is only applicable top add method
 and test 1 has add and sub 
 even if we call in test it wornt work
 */
interface test{
  void add();
}
interface test1 extends test{
  void sub();
}
class sharan implements test1{
  @Override
  public void add(){
    int a =10;
    int b = 10;
    int c ;
    c = a+b;
    System.out.println(c);
  }
  public void sub(){
    int a = 20;
    int b =10;
    int c;
    c = a-b;
    System.out.println(c);
  }
  public static void main(String[] args){
    sharan s = new sharan();
    s.add();
    s.sub();
  }
}