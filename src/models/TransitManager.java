package models;

import java.util.HashMap;

public class TransitManager {

	private HashMap<Integer, Person> personList;
	private HashMap<Integer, Policeman> policemanList;
	private HashMap<Integer, Ticket> ticketList;

	public TransitManager() {
		policemanList = new HashMap<Integer, Policeman>();
		ticketList = new HashMap<Integer, Ticket>();
		personList = new HashMap<Integer, Person>();
	}
	
	public void addPerson(int key, Person person) {
		personList.put(key, person);
	}
	
	public void addPoliceman(int key, Policeman policeman) {
		policemanList.put(key, policeman);
	}
	
	public void addTicket(int key, Ticket ticket) {
		ticketList.put(key, ticket);
	}
	
	public void payTicket(Ticket ticket) {
		ticketList.remove(ticket.getCode());
	}
	
	public void showList(HashMap hashmap) {
		System.out.println(hashmap);
	}
	
	public Ticket searchTicket(int keyTicket) {
		return ticketList.get(keyTicket);
	}
	
	public Policeman searchPoliceman(int keyPoliceman) {
		return policemanList.get(keyPoliceman);
	}
	
	public Person searchPerson(int keyPerson) {
		return personList.get(keyPerson);
	}
	
	public static void main(String[] args) {
		new TransitManager();
	}
}