package a6q1;

public class ExceptionLineTooLong extends Exception {
	private String string;
	public ExceptionLineTooLong() {
	
	}
	
	public String getString() {
		return string;
	}

	public void setString(String string)throws ExceptionLineTooLong{
		
		if (string.length() > 80)
			throw new ExceptionLineTooLong("String is greater than 80 characters");
		this.string = string;
	}

	public ExceptionLineTooLong(String string) {
	
		this.string = string;
	}

	public ExceptionLineTooLong(String string,String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong : getMessage() = " + string + ", String Length = "+string.length();
	}

	
	

}
