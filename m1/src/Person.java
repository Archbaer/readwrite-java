public class Person {
    String name;
    int age;
    double weight;

    Person(String name, int age, double weight) {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public String toString() {
        return String.format("Name: %s Age: %s Weight: %s", this.name, this.age, this.weight);
    }
}
