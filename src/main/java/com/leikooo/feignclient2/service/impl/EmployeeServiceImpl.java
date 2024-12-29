package com.leikooo.feignclient2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leikooo.feignclient2.entity.Employee;
import com.leikooo.feignclient2.mapper.EmployeeMapper;
import com.leikooo.feignclient2.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
* @author liang
* @description 针对表【employee】的数据库操作Service实现
* @createDate 2024-10-31 20:02:17
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService {

}




