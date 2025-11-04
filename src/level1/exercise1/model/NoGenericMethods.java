package level1.exercise1.model;

public class NoGenericMethods {
    private String first;
    private String second;
    private String third;

    public NoGenericMethods(String first, String second, String third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }


    public void printElements() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
    }
}
