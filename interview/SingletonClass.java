public class SingletonClass {
    public static SingletonClass sc = null;
    public String str;


    private SingletonClass(){
        str = "this is String";
    }

}