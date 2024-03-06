/*A contructor where one or more parameters can be passed */

class Parameterizedconst{
    int x,y;
    Parameterizedconst(int a, int b){
        x = a;
        y = b;

    }
    void result(){
        System.out.println("Hey there "+x+" "+y);
    }
}
class last{
    public static void main(String[] args){
        Parameterizedconst p = new Parameterizedconst(10,20);
        p.result();
    }
}