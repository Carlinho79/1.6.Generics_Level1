package level1.exercise1.app;

import level1.exercise1.model.NoGenericMethods;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods noGenericObject1 = new NoGenericMethods("Barcelona", "Madrid", "Sevilla");
        noGenericObject1.printElements();

        NoGenericMethods noGenericObject2 = new NoGenericMethods("Madrid", "Sevilla", "Barcelona");
        noGenericObject2.printElements();
    }
}
