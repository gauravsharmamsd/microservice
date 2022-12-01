package com.addressservice.model;

import lombok.Data;

@Data
public class AddressResponse {
	private int id;
	private String lane1;
	private String lane2;
	private String city;
	private String country;
}
