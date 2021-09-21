package views;

import javax.swing.*;
import models.*;

public class Window {

	private static final String TITLE_OPTION = "OPCION";
	private static final String MESSAGE_OPTION = "Escoja una opcion: ";
	private static final String TITLE_CODE_TICKET = "CODIGO DE LA MULTA";
	private static final String MESSAGE_CODE_TICKET = "Ingrese el codigo de la multa: ";
	private static final String TITLE_TYPE_TICKET = "TIPOS COMPARENDOS";
	private static final String MESSAGE_TYPE_TICKET = "Escoja el tipo de comparendo";
	private static final String MESSAGE_PHONE = "Ingrese su numero de telefono: ";
	private static final String TITLE_PHONE = "TELEFONO";
	private static final String TITLE_ID = "IDENTIFICACION";
	private static final String MESSAGE_ID = "Ingrese su id: ";
	private static final String TITLE_CODE_POLICEMAN = "CODIGO POLICIAL";
	private static final String MESSAGE_CODE_POLICEMAN = "Ingrese el codgio del policia: ";
	private static final String TITLE_NAME = "NOMBRE";
	private static final String MESSAGE_NAME = "Ingrese su nombre: ";

	public String getName() {
		return JOptionPane.showInputDialog(null, MESSAGE_NAME, TITLE_NAME, JOptionPane.QUESTION_MESSAGE);
	}
	
	public int getCode() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, MESSAGE_CODE_POLICEMAN, TITLE_CODE_POLICEMAN, JOptionPane.QUESTION_MESSAGE));
	}
	
	public int getId() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, MESSAGE_ID, TITLE_ID, JOptionPane.QUESTION_MESSAGE));
	}

	public int getPhone() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, MESSAGE_PHONE, TITLE_PHONE, JOptionPane.QUESTION_MESSAGE));
	}
	
	public TypeTicket getTypeTicket() {
		int option = JOptionPane.showOptionDialog(null, MESSAGE_TYPE_TICKET, TITLE_TYPE_TICKET,
		        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
		        TypeTicket.values(), TypeTicket.values()[0]);;
		return TypeTicket.values()[option];
	}
	
	public Options getOption() {
		int option = JOptionPane.showOptionDialog(null, MESSAGE_OPTION, TITLE_OPTION,
		        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
		        Options.values(), Options.values()[0]);;
		return Options.values()[option];
	}
	
	public int getCodeTicket() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, MESSAGE_CODE_TICKET, TITLE_CODE_TICKET, JOptionPane.QUESTION_MESSAGE));
	}
	
}
