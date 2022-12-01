package com.addressservice.repo;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.addressservice.pojo.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	@Query ( nativeQuery = true ,value = "SELECT ea.id,ea.lane1,ea.lane2,ea.city,ea.country FROM microservice.address ea join microservice.employee e on ea.employee_id=e.id where ea.employee_id=:id")
	Address findBypinCode(@Param("id")int id);

}
