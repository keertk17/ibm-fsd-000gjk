package comm.example.spring;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component("dsource")
public class BasicDataSource extends org.apache.commons.dbcp.BasicDataSource {

		@PostConstruct
		public void init() {
			setUrl("jdbc:mysql://localhost::3306/mydb");
			setUsername("root");
			setPassword("Prakshi@1509");
			setDriverClassName("com.mysql.jdbc.Driver");
			
		}	
}