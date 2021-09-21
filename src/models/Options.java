package models;

public enum Options {

	ADD_PERSON("Aniadir personas"), ADD_POLICEMAN("Aniadir policia"), ADD_TICKET("Anadir multa"), PAY_TICKET("Pagar multa");
	
	private String description;
	
	Options(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
	}
}
