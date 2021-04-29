package com.sample.employeedemo.entity;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {
	private String address;
	private Integer pincode;
	private Integer phoneNumber;

}
