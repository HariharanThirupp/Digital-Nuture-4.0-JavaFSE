package EagerSingleton;
public class Main {
    public static void main(String[] args) {
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();

        
        System.out.println("Are both instances same? " + (s1 == s2));
    }
}
