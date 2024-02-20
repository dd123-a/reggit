package reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import reggie.entity.Employee;
import reggie.mapper.EmployeeMapper;
import reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
