package comm.example.spring;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String email;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String favlang;
	private String[] operatingSystem;
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");		

	}
	public Student(String firstName, String lastName, String email,String country,String favlang) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.country=country;
		this.favlang=favlang;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getFavlang() {
		return favlang;
	}
	public void setFavlang(String favlang) {
		this.favlang = favlang;
	}
	
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", country="
				+ country + ", countryOptions=" + countryOptions + ", favlang=" + favlang + ", operatingSystem="
				+ Arrays.toString(operatingSystem) + "]";
	}
	
	
}
