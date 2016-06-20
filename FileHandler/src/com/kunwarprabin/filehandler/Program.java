/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.filehandler;

import com.kunwarprabin.filehandler.controller.ProgramController;


/**
 *
 * @author OWNER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProgramController pc = new ProgramController();
        pc.fileHandler();
        pc.showAll();
        
    }
}
