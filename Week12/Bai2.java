
class Singleton{
    private static Singleton instance = null;
    private Singleton(){};
    public static Singleton getInstance(){
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }
}
public class Bai2 {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
    }
}
