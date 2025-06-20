package LazySingleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();
        

        System.out.println("Are both instances the same? " + (s1 == s2));
    }
}
