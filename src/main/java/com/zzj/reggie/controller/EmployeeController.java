package com.zzj.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzj.reggie.common.R;
import com.zzj.reggie.entity.Employee;
import com.zzj.reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie.controller
 * @Author: zzj
 * @CreateTime: 2022-10-05  13:51
 * @Description: TODO
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee) {
        //将页面提交的密码进行md5加密
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        //根据页面提交的用户名username查询数据库
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Employee::getUsername, employee.getUsername());
        Employee emp = employeeService.getOne(queryWrapper);

        //如果没有查询到则返回登录失败结果
        if (emp == null) {
            return R.error("登录失败");
        }

        //密码比对，如果不一致则返回登录失败结果
        if (!emp.getPassword().equals(password)) {
            return R.error("登录失败");
        }

        //查看员工状态，如果为已禁用状态，则返回员工已禁用结果
        if (emp.getStatus() == 0) {
            return R.error("账号已禁用");
        }

        request.getSession().setAttribute("employee", emp.getId());
        return R.success(emp);
    }

    @RequestMapping("/logout")
    public R<String> logout(HttpServletRequest request) {
        //清理session中保存的当前登录员工的id
        request.getSession().removeAttribute("employee");
        log.info("员工已退出成功");
        return R.success("退出成功");
    }

    @PostMapping
    public R<String> save(HttpServletRequest request, @RequestBody Employee employee) {
        //设置初始密码123456，需要进行md5加密
        employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));

        employee.setCreateTime(LocalDateTime.now());
        employee.setUpdateTime(LocalDateTime.now());

        //获取当前登录用户的id
        Long empId = (Long) request.getSession().getAttribute("employee");

        employee.setCreateUser(empId);
        employee.setUpdateUser(empId);

        employeeService.save(employee);
        return R.success("新增员工成功");
    }

    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name) {
        //构建分页构造器
        Page pageInfo = new Page(page, pageSize);
        //构造条件构造器
        LambdaQueryWrapper<Employee> lambdaQueryWrapper = new LambdaQueryWrapper();
        //添加过滤条件
        lambdaQueryWrapper.like(StringUtils.isNotEmpty(name), Employee::getName, name);
        //添加排序条件
        lambdaQueryWrapper.orderByDesc(Employee::getUpdateTime);
        //执行查询,结果包装回pageInfo对象
        employeeService.page(pageInfo, lambdaQueryWrapper);

        return R.success(pageInfo);
    }
}
