package session7.tamrin;

public abstract class Person {

    private String name;
    private String family;
    private String nationalCode;
    private String address;


    public Person(String name, String family, String nationalCode, String address) {
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Person setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public Person setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }
    public abstract String getRole();

    public abstract void save();


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
