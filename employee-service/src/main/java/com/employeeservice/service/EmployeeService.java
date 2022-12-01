package com.employeeservice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.employeeservice.entity.Employee;
import com.employeeservice.feignclient.AddressFeignClient;
import com.employeeservice.model.AddressResponse;
import com.employeeservice.model.EmployeeResponse;
import com.employeeservice.repo.EmployeeRepository;
import com.employeeservice.sort.SortingByName;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ModelMapper modelMapper;
	// @Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AddressFeignClient addressFeignClient;

	@Value("${addressservice.base.url}")
	private String addressBaseURL;

	@Autowired
	private WebClient webClient;

	public EmployeeService(@Value("${addressservice.base.url}") String addressBaseURL, RestTemplateBuilder builder) {
		this.restTemplate = builder.rootUri(addressBaseURL).build();
	}

	public EmployeeResponse geEmployeeResponse(int id) {
		AddressResponse addressResponse = null;
		EmployeeResponse employeeResponse = null;
		employeeResponse = modelMapper.map(employeeRepository.findById(id).get(), EmployeeResponse.class);

		/*
		 * using resttemplate addressResponse =
		 * restTemplate.getForObject("/address/{id}", AddressResponse.class, id);
		 */

		/*
		 * using webClient addressResponse = webClient.get().uri("/address/" +
		 * id).retrieve().bodyToMono(AddressResponse.class).block();
		 */

		/*
		 * 
		 * using feignclient
		 */
		addressResponse = addressFeignClient.getAddressByEmployeeId(id);
		employeeResponse.setAddressResponse(addressResponse);
		return employeeResponse;

	}

	public List<EmployeeResponse> geEmployeeResponse() {
		List<Employee> employees = employeeRepository.findAll();

		return map(employees);

	}

	private List<EmployeeResponse> map(List<Employee> employees) {
		List<EmployeeResponse> employeeResponses = new ArrayList<EmployeeResponse>();
		employees.forEach(employee -> {
			EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
			employeeResponses.add(employeeResponse);

		});

		Collections.sort(employeeResponses, new SortingByName());
		return employeeResponses;

	}

	public void saveEmployee(EmployeeResponse employeeResponse) {

		Employee employee = modelMapper.map(employeeResponse, Employee.class);

		employeeRepository.save(employee);
	}
}
