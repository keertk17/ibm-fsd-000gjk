package IBM_1308;

public class Messaging {

	private String message;
	private static Messaging messaging; 
	private Messaging() {
	}
	
		
	public Messaging(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Messaging [message=" + message + "]";
	}
	
	public Messaging createMessagingObject() {
		if(messaging==null)
		{
			messaging=new Messaging();
		}
		return messaging;
	//}
//}
	//public Messaging createMessagingObject(String ) {
		//if(messaging==null)
	//	{
	//		messaging=new Messaging();
		//}
		//return messaging;
	}
}
