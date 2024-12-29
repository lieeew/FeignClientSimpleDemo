package com.leikooo.feignclient2.controller;

import com.leikooo.feignclient2.entity.Employee;
import com.leikooo.feignclient2.feign.EmployeeClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <a href="https://github.com/lieeew">leikooo</a>
 * @date 2024/10/31
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private EmployeeClient employeeClient;

    @GetMapping("/get")
    public Employee getById() {
        return employeeClient.getAddressByEmployeeId(1);
    }

}
