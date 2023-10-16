package a8_q2;

public class Box<t> {
	private t data;

	public Box(t data) {
		super();
		this.data = data;
	}

	public Box() {
		super();
	}

	public t getData() {
		return data;
	}

	public void setData(t data) {
		this.data = data;
	}

	public static void printDisyplayableBox(Box<? extends Displayable> b){
		b.getData().displayData();

	}
	
	public static void printAnyBox(Box <?> b) {
		System.out.println(b.getData().toString());

	}
	
	
	public static void main(String[] args) {
		Box<Employee> e =new Box<>();
		e.setData(new Employee());
		e.getData().acceptData();
		printDisyplayableBox(e);
		
		Box<Date> d = new Box<Date>();
		d.setData(new Date());
		d.getData().acceptData();
		printDisyplayableBox(d);
		
		Box<String> s = new Box<String>();
		s.setData("Awesome");
		//printDisyplayableBox(s); //compile time error because it will show only extended class
		
		printAnyBox(e);
		printAnyBox(d);
		printAnyBox(s);
		
	}

}

