package homework.lab3.pro4;

public class Driver {

	public static void main(String[] args) {
Address address=new Address("h2","fairfield","iowa ",525575);

		Object[] objects = { new House(address,9000), new Condo(address,2), new Trailer(address) };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
