package models;

public class Ticket {

	private int code;
	private Person person;
	private Policeman policeman;
	private String report;
	private TypeTicket typeTicket;
	private int value;
	public static int countCode = 5000;
	
	public Ticket(Person person, Policeman policeman, TypeTicket typeTicket, int value, String report) {
		this.person = person;
		this.policeman = policeman;
		this.report = report;
		this.typeTicket = typeTicket;
		this.value = value;
		code = ++countCode;
	}
	
	public int getCode() {
		return code;
	}
	
	@Override
	public String toString() {
		return report + ", Hecha por: " + policeman + ", Para: " + person + ", tipo: " + typeTicket;
	}
}
