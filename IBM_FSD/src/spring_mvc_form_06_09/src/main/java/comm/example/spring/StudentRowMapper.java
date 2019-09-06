package comm.example.spring;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public final class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setFirstName(rs.getString(1));
		student.setLastName(rs.getString(2));
		student.setCountry(rs.getString(3));
		student.setFavlang(rs.getString(4));
		//student.setOperatingSystems(rs.getString(5).toString());
		return student;
	}

}