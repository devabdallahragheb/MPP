package homework.lab3.pro4;

public class Trailer extends Property {


    public Trailer(Address address ) {
        super(address);

    }

    @Override
    public double computeRent() {
        return 500;
    }

    public Address getTrailerParkAddress() {
        return getAddress();
    }}