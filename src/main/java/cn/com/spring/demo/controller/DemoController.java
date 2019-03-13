package cn.com.spring.demo.controller;

import cn.com.spring.demo.model.Employees;
import cn.com.spring.demo.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: lijian
 * @Date: 2019/3/13 10:27
 */

@Controller
public class DemoController {

    @Autowired
    private EmployeesService employeesService;

    @RequestMapping(value="/listEmployees",produces="text/html;charset=UTF-8")
    public @ResponseBody String listEmployees(){
        return employeesService.listEmployees(new Employees()).toString();
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
