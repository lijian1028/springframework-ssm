package cn.com.spring.demo.service;


import cn.com.spring.demo.model.Employees;

import java.util.List;

/**
 * @Author: lijian
 * @Date: 2019/2/20 10:48
 */
public interface EmployeesService {

    /**
     * 根据条件查询工人信息
     * @param employees
     * @return
     */
    List<Employees> listEmployees(Employees employees);

}
