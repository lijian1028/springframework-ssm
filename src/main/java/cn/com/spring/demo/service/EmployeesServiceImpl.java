package cn.com.spring.demo.service;

import cn.com.spring.demo.dao.EmployeesMapper;
import cn.com.spring.demo.model.Employees;
import cn.com.spring.demo.model.EmployeesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lijian
 * @Date: 2019/3/13 11:24
 */
@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesMapper mapper;
    /**
     * 根据条件查询工人信息
     *
     * @param employees
     * @return
     */
    @Override
    public List<Employees> listEmployees(Employees employees) {
        return mapper.selectByExample(convert(employees));
    }

    private EmployeesExample convert(Employees employees){
        EmployeesExample example = new EmployeesExample();
        EmployeesExample.Criteria criteria = example.createCriteria();
        if(employees.getId() != null){
            criteria.andIdEqualTo(employees.getId());
        }
        if(employees.getNumber() != null){
            criteria.andNumberNotEqualTo(employees.getNumber());
        }
        if(employees.getName() != null){
            criteria.andNameEqualTo(employees.getName());
        }
        if(employees.getAge() != null){
            criteria.andAgeEqualTo(employees.getAge());
        }
        if(employees.getSex() != null){
            criteria.andSexEqualTo(employees.getSex());
        }
        if(employees.getPhone() != null){
            criteria.andPhoneEqualTo(employees.getPhone());
        }
        if(employees.getIdNumber() != null){
            criteria.andIdNumberEqualTo(employees.getIdNumber());
        }
        if(employees.getAddress() != null){
            criteria.andAddressEqualTo(employees.getAddress());
        }
        if(employees.getDepartment() != null){
            criteria.andDepartmentEqualTo(employees.getDepartment());
        }
        if(employees.getPosition() != null){
            criteria.andPositionEqualTo(employees.getPosition());
        }
        return example;
    }
}
