
interface interface1{//customer
  int amt=5; // variables in interface will be public, static, final
  //and static will get called as they do not deal with objects
  void purchase();
}
 class sellersanju implements interface1 {//shop owner
  @Override
  public void purchase(){
    System.out.println("rice is "+amt+" kg ");
  }
}
class show{
  public static void main(String[] args){
    interface1 t = new sellersanju();
    t.purchase();
    System.out.println(sellersanju.amt);

  }
}
