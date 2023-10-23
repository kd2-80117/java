package demo.generic;

 class ObjectBox {
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

		
}
 
 class GenericBox<t>{
	 private t data;

	public t getData() {
		return data;
	}

	public void setData(t data) {
		this.data = data;
	}
	 
	
}
 
 public class Box{
	 public static void main(String[] args) {
		
	}
 }

