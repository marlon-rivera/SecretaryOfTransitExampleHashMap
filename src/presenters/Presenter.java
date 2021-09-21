package presenters;

import models.*;
import views.*;

public class Presenter {

	private TransitManager transit;
	private Window window;
	
	public Presenter() {
		transit = new TransitManager();
		window = new Window();
		showMenu();
	}
	
	private void addPerson() {
		String name = window.getName();
		int id = window.getId();
		int phone = window.getPhone();
		Person person = new Person(name, id, phone);
		transit.addPerson(person.getId(), person);
	}
	
	private void addPolice() {
		String name = window.getName();
		int id = window.getId();
		int phone = window.getPhone();
		Policeman policeman = new Policeman(name, id, phone);
		transit.addPoliceman(policeman.getCode(), policeman);
	}
	
	private void addTicket() {
		Person person = transit.searchPerson(window.getId());
		Policeman policeman = transit.searchPoliceman(window.getCode());
		TypeTicket typeTicket = window.getTypeTicket();
		int value = typeTicket.getValue();
		String report = typeTicket.getDescription();
		Ticket ticket = new Ticket(person, policeman, typeTicket, value, report);
		transit.addTicket(ticket.getCode(), ticket);
	}
	
	private void payTicket() {
		transit.payTicket(transit.searchTicket(window.getCodeTicket()));
	}
	
	private void showMenu() {
		Options option = window.getOption();
		switch (option) {
		case ADD_PERSON:
			addPerson();
			break;
		case ADD_POLICEMAN: 
			addPolice();
			break;
		case ADD_TICKET:
			addTicket();
			break;
		case PAY_TICKET:
			payTicket();
			break;
		default:
			break;
		}
		showMenu();
	}
	
	public static void main(String[] args) {
		new Presenter();
	}
}
