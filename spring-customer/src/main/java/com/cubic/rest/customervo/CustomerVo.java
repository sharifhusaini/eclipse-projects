
package com.cubic.rest.customervo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerVo {
	
	
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	public CustomerVo() {
		super();
	}
	public CustomerVo(Long id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

}
