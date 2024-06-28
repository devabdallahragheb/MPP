package homework.lab3.pro4;

abstract class Property {
    private Address address;

    public Property(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public abstract double computeRent();
}
