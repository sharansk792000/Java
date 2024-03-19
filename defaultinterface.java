/*Here in default interface
 when we create a method in interface class it is normally abstract and public
 as all the methods in interface must be implemented in all the classes we implement
 but after java jdk 1.8 it changed and it is optional to user 
 here we user default in fornt of method declaration
 and its is optional to use in different class 
 */
interface defaultinterface{
  void a1();
  void a2();
  default void a3(){
       System.out.println("May or may not override in implementing classes");
  }
  
 }
 class test1 implements defaultinterface{
  public void a1(){
    System.out.println("Class a a1()");
  }
  public void a2(){
    System.out.println("Class a of a2");
  }
 }
 class test2 implements defaultinterface{
  public void a1(){
    System.out.println("Class b a1()");
  } 
  public void a2(){
    System.out.println("Class b of a2");
  }
 }
 class test3 implements defaultinterface{
  public void a1(){
    System.out.println("Class c a1()");
  }
  public void a2(){
    System.out.println("Class c of a2");
  }
 }
 class show{
  public static void main(String[] args){
    test1 t1 = new test1();
    t1.a1();t1.a2();t1.a3();
    test2 t2 = new test2();
    t2.a1();t2.a2(); t2.a3();
    test3 t3 = new test3();
    t3.a1();t3.a2(); t3.a3();


  }
 }