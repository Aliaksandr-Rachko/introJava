package by.epam.introductiontojava.programming_with_classes_4.simplest_classes_and_objects.task10;

public enum AircraftType {
    A300("Airbus A300"),
    A310("Airbus A310"),
    A320("Airbus A320"),
    A330("Airbus A330"),
    A220("Airbus A220");

    private String name;

    AircraftType(String type) {
        this.name = type;
    }

    @Override
    public String toString() {
        return name;
    }
}
