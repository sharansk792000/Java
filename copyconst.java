/*When ever we object reference to constructor its called as copy constructor 
 It copies data from other constructor */
public class copyconst {
    int a; String b;
    copyconst(){
         a = 10;
         b = "hello";   
         System.out.println(a+" "+b);  
    }
    copyconst(copyconst ref){
        a = ref.a;
        b = ref.b;
        System.out.println(a+" "+b);
        
    }
}
class view{
    public static void main(String[] args){
        copyconst r = new copyconst();
        copyconst r1 = new copyconst(r);
    }
}
