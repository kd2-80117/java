package hardware.invoice.test;

import hardware.invoice.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("p1","hammer",5,-8);
		invoice.calculateInvoice();
		

	}

}
