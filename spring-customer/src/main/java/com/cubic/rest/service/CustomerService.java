package com.cubic.rest.service;

import com.cubic.rest.customervo.CustomerVo;
import com.cubic.rest.entity.CustomerEntity;

public interface CustomerService {
	
	CustomerVo createCustomer(final CustomerVo customer);
	void modifyCustomer(final CustomerVo customer);
	CustomerEntity findCustomer(final Long id);
	void removeCustomer(final Long id);
	

}
