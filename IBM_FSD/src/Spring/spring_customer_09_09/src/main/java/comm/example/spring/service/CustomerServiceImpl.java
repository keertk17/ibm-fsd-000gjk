package comm.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.example.spring.dao.CustomerDAO;
import comm.example.spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	@Transactional
	public void createCustomer(Customer theCustomer) {
		dao.createCustomer(theCustomer);

	}
	
		@Transactional
		public List<Customer> getCustomers() {
			return dao.getCustomers();
		}
		
		@Transactional
		public void deleteCustomer(int id) {
			 dao.deleteCustomer(id);
			
		}

		public Customer getCustomer(int theId) {
			// TODO Auto-generated method stub
			return dao.getCustomer(theId);
		}
	}

