package level1.exercise2.model;

public class GenericMethods {

    public static <T, U, V> void printElements(T first, U second, V third) {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
        System.out.println("---------------------");
    }
}
