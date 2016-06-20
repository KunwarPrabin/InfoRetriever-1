/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.filehandler.controller;

import com.kunwarprabin.filehandler.dao.EmployeeDAO;
import com.kunwarprabin.filehandler.entity.Employee;
import com.kunwarprabin.filehandler.impl.EmployeeDAOImpl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author OWNER
 */
public class ProgramController {

    EmployeeDAO emDAO = new EmployeeDAOImpl();

    public void fileHandler() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:\\GITHUB\\FileHandler\\src\\com\\kunwarprabin\\filehandler\\DATA\\data.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] splitter = line.split(",");
                if (splitter.length >= 5) {
                    Employee employee = new Employee();
                    employee.setId(Integer.parseInt(splitter[0]));
                    employee.setFirstName(splitter[1]);
                    employee.setLastName(splitter[2]);
                    employee.setEmail(splitter[3]);
                    if (Integer.parseInt(splitter[4]) == 1) {
                        employee.setStatus(true);
                    } else {
                        employee.setStatus(false);
                    } emDAO.addEmployee(employee);

                    if (!(emDAO.checkId(employee)) && emDAO.checkEmail(employee)) {
                        emDAO.addEmployee(employee);
                    }

                } 
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getLocalizedMessage());
        }
    }

    public void showAll() {
        for (Employee ep : emDAO.getEmployee()) {
            System.out.println("ID:" +ep.getId());
            System.out.println("First Name:" +ep.getFirstName());
            System.out.println("Last Name:" +ep.getLastName());
            System.out.println("email:" +ep.getEmail());
            System.out.println("Availability:" +ep.isStatus());
        }
    }

}
