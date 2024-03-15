abstract public class abstractmethod {
    abstract void college();
}
class informationscience extends abstractmethod{
    @Override
    public void college(){
        System.out.println("This branch is information science");
    }
}
class computerscience extends abstractmethod{
    @Override
    public void college(){
        System.out.println("This is cs branch");

    }
}
 class showoutput{
    public static void main(String[] args){
        abstractmethod i = new informationscience();
        i.college();
        abstractmethod c = new computerscience();
        c.college();
    }
}