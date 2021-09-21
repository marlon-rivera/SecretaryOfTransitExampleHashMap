package models;

public class Person {

	protected String name;
	protected int id;
	protected int phone;
	
	public Person(String name, int id, int phone) {
		this.name = name;
		this.id = id;
		this.phone = phone;
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return name + ", Indentificado con el numero: " + id;
	}
}
