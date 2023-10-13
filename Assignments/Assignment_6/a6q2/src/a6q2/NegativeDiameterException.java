package a6q2;

public class NegativeDiameterException extends RuntimeException{
	
	private String message;
	
	public NegativeDiameterException() {
		super();
		
	}
	
	public NegativeDiameterException(String message) {
		this.message=message;
		
	}
	@Override
	public String toString() {
		return "NegativeDiameterException [ Error Message = "+message+"]";
	}

}
