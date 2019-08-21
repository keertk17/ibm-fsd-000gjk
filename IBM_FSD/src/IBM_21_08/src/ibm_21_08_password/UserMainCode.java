package ibm_21_08_password;

public class UserMainCode {
	
	public static boolean checkPassword(String password){
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		if(password.matches(pattern))
				{
			return true;
				}
		else {
			return false;
		}
	}
}
