package com.cubic.rest.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.cubic.rest.customervo.CustomerVo;
import com.cubic.rest.entity.CustomerEntity;
import com.cubic.rest.exceptions.CustomerNofoundException;
import com.cubic.rest.exceptions.InvalidDataException;
import com.cubic.rest.mapper.CustomerMapper;

@Service
@Transactional
@Qualifier("customerimpl")
public class CustomerServiceImpl implements CustomerService {

	@PersistenceContext
	private EntityManager em;
	@Autowired
	private CustomerMapper mapper;

	@Override
	public CustomerVo createCustomer(CustomerVo customer) {
		if (customer == null || StringUtils.isEmpty(customer.getFirstName())
				|| StringUtils.isEmpty(customer.getLastName()))

			throw new InvalidDataException(
					"creating customer fialed , please insert a valid customer (fristName) and (lastName)");
		CustomerEntity entity = mapper.maptoCustomerEntity(customer);
		em.persist(entity);
		customer.setId(entity.getId());
		return customer;
	}

	@Override
	public void modifyCustomer(CustomerVo customer) {
		if (customer == null || StringUtils.isEmpty(customer.getFirstName())
				|| StringUtils.isEmpty(customer.getLastName()))
			throw new CustomerNofoundException("no custmer found with this id , please isnert a valid id");
		CustomerEntity entity = em.find(CustomerEntity.class, customer.getId());
		entity = mapper.maptoCustomerEntity(entity, customer);
		em.persist(entity);
	}

	@Override
	public CustomerEntity findCustomer(Long id) {
		if (id == null)
			throw new CustomerNofoundException("no customer avalaible with this " + id + " a valid id is required !!");
		CustomerEntity entity = em.find(CustomerEntity.class, id);
		return entity;
	}

	@Override
	public void removeCustomer(Long id) {
		CustomerEntity entity = em.find(CustomerEntity.class, id);
		em.remove(entity);

	}

}
