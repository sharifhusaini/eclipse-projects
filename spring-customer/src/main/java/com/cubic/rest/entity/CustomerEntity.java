package com.cubic.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "CUSTOMER_TABLE")

@Getter
@Setter
@ToString

public class CustomerEntity {
	@Id
	@SequenceGenerator(name = "c_Seq", sequenceName = "JPA_SEQ")
	@GeneratedValue(generator = "c_Seq")
	@Column(name="ID")
	private Long id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "AGE")
	private int age;

}
