package level1.exercise2.app;

import level1.exercise2.model.GenericMethods;
import level1.exercise2.model.Persona;

public class Main {
    public static void main(String[] args) {

        // Using GenericMethods to print different types of data
        // Import statements and class definitions are assumed to be present

        GenericMethods.printElements("Barcelona", "Madrid", "Sevilla");
        GenericMethods.printElements(100, 200, 300);
        GenericMethods.printElements(45.5, 78.9, 12.3);

        Persona persona1 = new Persona("John", "Doe", 30);
        //Persona persona2 = new Persona("Jane", 25, "Smith"); // Incorrect order of parameters (Not allowed)
        Persona persona2 = new Persona("Jane", "Smith", 25);
        //Persona persona3 = new Persona(28, "Johnson", "Emily"); // Incorrect order of parameters (Not allowed)
        Persona persona3 = new Persona("Emily", "Johnson", 28);


        GenericMethods.printElements(persona1, persona2, persona3);
    }
}
