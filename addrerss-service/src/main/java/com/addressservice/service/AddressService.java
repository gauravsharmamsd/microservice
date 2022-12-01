package com.addressservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.addressservice.model.AddressResponse;
import com.addressservice.pojo.Address;
import com.addressservice.repo.AddressRepository;
@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private ModelMapper modelMapper;

	public AddressResponse geAddressResponse(int id) {
		Address address = addressRepository.findBypinCode(id);
		return modelMapper.map(address, AddressResponse.class);

	}
}
