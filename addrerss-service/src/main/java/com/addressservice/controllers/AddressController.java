package com.addressservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.addressservice.model.AddressResponse;
import com.addressservice.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	AddressService addressService;

	@GetMapping("/address/{pincode}")
	public AddressResponse geAddressResponse(@PathVariable("pincode") int pincode) {

		return addressService.geAddressResponse(pincode);

	}
}
