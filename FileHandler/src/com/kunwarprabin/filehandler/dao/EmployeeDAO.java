/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.filehandler.dao;

import com.kunwarprabin.filehandler.entity.Employee;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public interface EmployeeDAO {
    boolean addEmployee(Employee em);
    ArrayList<Employee> getEmployee();
    boolean checkId(Employee em);
    boolean checkEmail(Employee em);
}
