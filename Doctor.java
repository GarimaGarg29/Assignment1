public class Doctor extends Person {
    String specializationType;

    Doctor(String name, String specializationType) {
        this.name = name;
        this.specializationType = specializationType;

    }

    String displayDetails() {
        return super.name + " is a " + specializationType;
    }
}