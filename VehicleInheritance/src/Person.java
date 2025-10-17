public class Person {
    private String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Person theObject) {
        if (theObject == null) {
            throw new IllegalArgumentException("Cannot copy null Person");
        }
        this.name = theObject.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Person)) {
            return false;
        }
        Person that = (Person) other;
        return java.util.Objects.equals(this.name, that.name);
    }
}
