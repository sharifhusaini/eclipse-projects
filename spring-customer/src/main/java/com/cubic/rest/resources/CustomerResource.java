package com.cubic.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.cubic.rest.customervo.CustomerVo;
import com.cubic.rest.entity.CustomerEntity;
import com.cubic.rest.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Path("/customer")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@Slf4j
public class CustomerResource {

	@Autowired
	public CustomerService cs;

	@POST
	public Response createCustomer(final CustomerVo customer) {
		log.debug("loggermmo");
		CustomerVo results = cs.createCustomer(customer);
		return Response.ok().entity(results).build();
	}
	@PUT
	public Response modifyCutomer(final CustomerVo customer ) {
		cs.modifyCustomer(customer);
		return Response.noContent().build();
	}
	@GET
	@Path("{/id}")
	public Response findCustomer (@PathParam("id")final Long customerId) {
		CustomerEntity entity = cs.findCustomer(customerId);
		return Response.ok().entity(customerId).build();
	}
}
