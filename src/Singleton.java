public class Singleton {
    private static volatile Singleton s = null;
    private Singleton(){};
    public static synchronized Singleton getInstance(){
        if(s==null){
            s=new Singleton();
        }
        return s;
    }
}

class main{
    public static void main(String[] args){
       Singleton s1=Singleton.getInstance();
        System.out.println(s1.hashCode());
        Singleton s2=Singleton.getInstance();
        System.out.println(s2.hashCode());
    }

}