/* In static block the static gets executed first as this deals with class and do not work with objects
 as constructor works after instance has been creatcompiled static block runs only once */
public class staticblock {
    static{
        System.out.println("Hello world");
    }
    
    staticblock(){
        System.out.println("const working");
    }
    {
        System.out.println("working");
    }
    public static void main(String[] args){
staticblock ref = new staticblock();
    }
    
}
