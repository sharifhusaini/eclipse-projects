package com.cubic.rest.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cubic.rest.customervo.CustomerVo;
import com.cubic.rest.entity.CustomerEntity;

@Service
@Component

public class CustomerMapper {
	
	public CustomerEntity maptoCustomerEntity (final CustomerVo vo) {
		return maptoCustomerEntity(new CustomerEntity(), vo);
	}
	public CustomerEntity maptoCustomerEntity (CustomerEntity entity, CustomerVo vo) {
		entity.setFirstName(vo.getFirstName());
		entity.setLastName(vo.getLastName());
		entity.setAge(vo.getAge());
		entity.setId(vo.getId());
		return entity;
	}
	public CustomerVo maptoCustomerVo(final CustomerEntity entity) {
		CustomerVo result= new CustomerVo();
		result.setFirstName(entity.getFirstName());
		result.setLastName(entity.getLastName());
		result.setId(entity.getId());		
		return result;
	}
      
}
