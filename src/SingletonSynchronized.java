public class SingletonSynchronized {
    private static volatile SingletonSynchronized s = null;

    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getInstance() {
        if (s == null) {
            synchronized (SingletonSynchronized.class) {
                if (s == null) {
                    s = new SingletonSynchronized();
                }
            }
        }
        return s;
    }
}

class main1{
    public static void main(String[] args){
        SingletonSynchronized s1=SingletonSynchronized.getInstance();
        System.out.println(s1.hashCode());
        SingletonSynchronized s2=SingletonSynchronized.getInstance();
        System.out.println(s2.hashCode());
    }

}
