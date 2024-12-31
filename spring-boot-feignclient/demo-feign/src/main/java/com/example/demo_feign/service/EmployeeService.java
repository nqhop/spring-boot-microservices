package com.example.demo_feign.service;

import com.example.demo_feign.entity.Employee;
import com.example.demo_feign.feignclient.AddressClient;
import com.example.demo_feign.repository.EmployeeRepo;
import com.example.demo_feign.response.AddressResponse;
import com.example.demo_feign.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private AddressClient addressClient;

    public EmployeeResponse getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepo.findById(id);

        EmployeeResponse employeeResponse = mapper.map(employee.get(), EmployeeResponse.class);

        // Using FeignClient
        ResponseEntity<AddressResponse> addressResponse = addressClient.getAddressByEmployeeId(id);
        employeeResponse.setAddressResponse(addressResponse.getBody());

        return employeeResponse;
    }


}
