public class constoverload {
    int a; String b; double c;
    constoverload(){
        a = 100;
        b = "hello"; 
        c = 20.33;
        System.out.println(a+" "+b+" "+c);
    }
     constoverload(int x){
        a =x;
     }
    constoverload(int x,String y){
        a = x;
        b = y;
    }
    constoverload(int x, double z){
        a = x;
        c = z;
    }
}
class view{
    public static void main(String[] args){
    constoverload c = new constoverload(10);
    constoverload c1 = new constoverload(10,2.0);
    constoverload c2 = new constoverload(10, 20.8);
    System.out.println(c.a);
    System.out.println(c1.a+" "+c1.b);
    System.out.println(c2.a+" "+c2.b+" "+c2.c);
    }
}
