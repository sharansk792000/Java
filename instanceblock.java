/*Instance block is something which does not have a name 
it can be written inside class and not to be written inside a method */
public class instanceblock {
    int a;
    int b;
    instanceblock(){
        a = 20;
        b = 10;
        System.out.println(a+" "+b);
    }
    {
        a = 10;
        b =20;
        System.out.println(a+" "+b);
    }
}
class view{
    public static void main(String[] args){
        instanceblock ref = new instanceblock();
        
    }
}
