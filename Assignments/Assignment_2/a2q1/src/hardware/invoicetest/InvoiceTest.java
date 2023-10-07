package hardware.invoice.test;

import hardware.invoice.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice("p1","hammer",15,20.5);
		invoice.calculateInvoice();
		Invoice invoice1 = new Invoice("p2","tool",-5,20.5);
		invoice.calculateInvoice();
		Invoice invoice2 = new Invoice("p3","nail",15,-8.5);
		invoice.calculateInvoice();
		
	}

}
