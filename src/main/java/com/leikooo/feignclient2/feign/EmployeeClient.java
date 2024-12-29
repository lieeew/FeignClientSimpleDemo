package com.leikooo.feignclient2.feign;

import com.leikooo.feignclient2.entity.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employeeService", url = "http://localhost:9090", path = "/api")
public interface EmployeeClient {

    @GetMapping("/employee/{id}")
    Employee getAddressByEmployeeId(@PathVariable("id") int id);

}