package comm.example.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component(value="stud")
public class StudentDAO {
	@Autowired
	private JdbcTemp jTemplate;

	public JdbcTemp getJdbcTemplate() {
		return jTemplate;
	}

	public void setJdbcTemplate(JdbcTemp jdbcTemplate) {
		this.jTemplate = jdbcTemplate;
	}


	public void createStudent(Student student)
	{
		try {
			
			String query="insert into student(FirstName,LastName,Email,Country,FavLang,OS) values(?,?,?,?,?,?)";
			Object obj[]= {student.getFirstName(),student.getLastName(),student.getEmail(),student.getCountry(),student.getFavlang(),student.getOperatingSystem()};
			jTemplate.update(query,obj);
			System.out.println("done");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public List<Student> getAllstudent()
	{
		return jTemplate.query("select * from student", new StudentRowMapper());
	}
	public void deletestudent(int id)
	{
		String query="delete from student where id="+id;
		jTemplate.update(query);
		System.out.println("Delete is done");
	}
	
	

}