package IBM_1408;

public class PersonNotValidException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5659181882712374867L;
	private String message;
	
	public PersonNotValidException() {
		
	}
	
	public PersonNotValidException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	

}
