package pack;

public class Validate {
	
	String user;
	  String pass;

	  public Validate( ) {   }

	  public void setUser(String user)  				
	  {
	    this.user = user;
	  }
	  public String getUser( )
	  {
	    return user;
	  }

	  public void setPass(String pass)  				
	  {
	    this.pass = pass;
	  }
	  public String getPass( )
	  {
	    return pass;
	  }

	  public String validate(String s1,String s2)
	  {
	    if(s1.equals(user) && s2.equals(pass))
	      return "VALID";
	    else
	     return "INVALID";
	   }
	}

