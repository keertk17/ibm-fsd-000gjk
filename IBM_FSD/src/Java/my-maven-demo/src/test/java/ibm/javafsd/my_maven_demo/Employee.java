package ibm.javafsd.my_maven_demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	 private String Name;
	 @Column(name="password")
	 private String Password;
	 @Column(name="country")
	 private String Country;
	 @Column(name="email")
	 private String Email;
	 
	public Employee( String name, String password, String country, String email) {
		super();
		Name = name;
		Password = password;
		Country = country;
		Email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Password=" + Password + ", Country=" + Country + ", Email="
				+ Email + "]";
	}
 
}
