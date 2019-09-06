package comm.bean;

import org.springframework.stereotype.Component;

@Component("dsource")
public class BasicDataSource extends org.apache.commons.dbcp.BasicDataSource {

	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		super.setUsername("root");
	}
	@Override
	public synchronized void setUrl(String url) {
		// TODO Auto-generated method stub
		super.setUrl("jdbc:mysql://localhost:3306/mydb");
	}
	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword("Prakshi@1509");
	}
}