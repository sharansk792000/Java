import java.util.Scanner;

interface interface2{
  void marks();
  void total();
}
class calculatemarks implements interface2{
   int[] a = new int[721];
   int i,y =0,j;
   @Override
  
  public void marks(){   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter marks of 6 subjects");
    for( i = 1;i<7;i++){
      a[i] = sc.nextInt();
       
      // y = y+a[i];
    }
    // sc.close();
    // System.out.println(a[i]); 
  }
  public void total(){
    for(int j = 1; j<=6;j++){
      y = y+a[j];
      // System.out.println("the marks is "+a[j]);
    }
    System.out.println("The total marks is "+y);
  }
  

}
class show{
  public static void main(String[] args){
    interface2 t = new calculatemarks();
    t.marks();
    t.total();
  }
}