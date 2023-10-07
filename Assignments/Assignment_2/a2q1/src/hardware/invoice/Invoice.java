package hardware.invoice;

public class Invoice {

	String partNum;
	String partDesc;
	int qty;
	double price;

	public Invoice() {

	}

	public Invoice(String partNum, String partDesc, int qty, double price) {

		this.partNum = partNum;
		this.partDesc = partDesc;
		
		if (qty < 0) {
			this.qty = 0;
		} else
			this.qty = qty;
		if (price < 0) {
			this.price = 0.0;
		} else 
			this.price = price;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public int getQty() {

		return qty;
	}

	public void setQty(int qty) {
		if (qty < 0) {
			this.qty = 0;
		}
		else this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0.0;
		}
		else this.price = price;
	}

	public double calculateInvoice() {
		System.out.println("Invoice = " + this.qty * this.price);
		return this.qty * this.price;
	}

}
