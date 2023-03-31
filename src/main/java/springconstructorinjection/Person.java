package springconstructorinjection;

public class Person {

	private int personId;
	private String name;
	Address address;
	
	public Person(int personId, String name, Address address) {
		super();
		this.personId = personId;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
}
