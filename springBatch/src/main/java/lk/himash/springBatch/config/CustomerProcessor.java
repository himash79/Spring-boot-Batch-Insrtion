package lk.himash.springBatch.config;

import lk.himash.springBatch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		return customer;
	}

	
	/*
	 * Able to insert specific category batch data 
	 */
//	@Override
//	public Customer process(Customer customer) throws Exception {
//		if (customer.getCountry().equals("United States")) {
//			return customer;
//		} else {
//			return null;
//		}
//	}
}
