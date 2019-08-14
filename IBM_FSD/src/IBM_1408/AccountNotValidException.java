package IBM_1408;

public class AccountNotValidException extends Throwable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3109286612162748768L;
	private String message;
	
	public AccountNotValidException() {
		super();
	}
	
	public AccountNotValidException(String message) {
		super();
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
