package com.zzj.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzj.reggie.entity.Employee;
import com.zzj.reggie.mapper.EmployeeMapper;
import com.zzj.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie.service.impl
 * @Author: zzj
 * @CreateTime: 2022-10-05  13:50
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
