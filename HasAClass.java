
public class HasAClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("Santa Clara");
		Employee employee = new Employee(address);
		System.out.println(address.toString()); // in address class we have to override toString method to get the value
												// of the address
		System.out.println(employee); // toString
	}

}

class Address {
	String city;

	public Address() {
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

}

class Employee {
	Address address;

	public Employee() {
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

}