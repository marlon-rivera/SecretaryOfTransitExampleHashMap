package models;

public class Policeman extends Person{
	
	private int code;
	public static int countCode = 1000;
	
	public Policeman(String name, int id, int phone) {
		super(name, id, phone);
		code = ++countCode;
	}

	public int getCode() {
		return this.code;
	}
	
	@Override
	public String toString() {
		return name + ", Codigo de policia: " + code;
	}
}
