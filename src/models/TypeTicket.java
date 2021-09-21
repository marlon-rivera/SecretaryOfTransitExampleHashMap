package models;

public enum TypeTicket {
	
	A01("NO TRANSITAR POR LA DERECHA DE LA VIA", 119348), A02("SUJETARSE DE OTRO VEHICULO EN CIRCULACION", 119348), 
	A03("TRANSPORTAR PERSONAS O COSAS QUE DISMINUYAN LA VISIBILIDAD E INCOMODEN LA CONDUCCION", 119348), A04("TRANSITAR POR ANDENES Y DEMÁS LUGARES DESTINADOS AL TRANSITO DE PEATONES", 119348),
	A05("NO RESPETAR LAS SEÑALES DE TRANSITO", 119348);
	
	private String description;
	private int value;

	TypeTicket(String description, int value) {
		this.description = description;
		this.value = value;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getValue() {
		return this.value;
	}
}
