package cn.com.spring.demo.dao;

import java.util.List;

import cn.com.spring.demo.model.Employees;
import cn.com.spring.demo.model.EmployeesExample;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeesMapper {

    List<Employees> selectByExample(EmployeesExample example);

}