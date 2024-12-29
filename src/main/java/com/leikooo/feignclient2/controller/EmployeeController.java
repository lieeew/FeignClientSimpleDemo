package com.leikooo.feignclient2.controller;

import com.leikooo.feignclient2.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="https://github.com/lieeew">leikooo</a>
 * @date 2024/12/29
 * @description
 */
@RestController("/")
public class EmployeeController {

    @GetMapping("/employee/{id}")
    Employee getAddressByEmployeeId(@PathVariable("id") int id) {
        Employee employee = new Employee();
        employee.setAge("18");
        employee.setEmail("123@qq.com");
        employee.setId(id);
        employee.setName("leikooo");
        return employee;
    }
}
