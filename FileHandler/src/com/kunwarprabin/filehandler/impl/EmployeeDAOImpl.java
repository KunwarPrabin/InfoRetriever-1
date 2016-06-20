/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.filehandler.impl;

import com.kunwarprabin.filehandler.dao.EmployeeDAO;
import com.kunwarprabin.filehandler.entity.Employee;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    ArrayList<Employee> arraylist = new ArrayList<>();

    @Override
    public boolean addEmployee(Employee em) {
        return arraylist.add(em);
    }

    @Override
    public ArrayList<Employee> getEmployee() {
        return arraylist;
    }

    @Override
    public boolean checkId(Employee em) {
        for (Employee e : arraylist) {
            if (e.getId() == em.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkEmail(Employee em) {
        for (Employee e : arraylist) {
            if (e.getEmail().equals(em.getEmail())) {
                return true;
            }
        }
        return false;
    }

}
