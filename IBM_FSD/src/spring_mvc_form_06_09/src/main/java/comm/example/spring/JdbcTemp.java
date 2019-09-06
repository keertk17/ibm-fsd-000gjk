package comm.example.spring;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("jTemplate")
public class JdbcTemp extends JdbcTemplate{
	
	@Autowired
	BasicDataSource dSource;
	
	@PostConstruct
	public void init() {
		setDataSource(dSource);
	}
	
	public Connection getConnection() throws SQLException {
		return dSource.getConnection(dSource.getUsername(),dSource.getPassword());
	}
	
}