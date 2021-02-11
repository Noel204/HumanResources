/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesb.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

/**
 *
 * @author Noel
 */
public class HR_Main{
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.id = 1;
        e1.firstName = JOptionPane.showInputDialog(" ingrese nombre ");
        e1.lastName = JOptionPane.showInputDialog(" ingrese apellido ");
        e1.age = Integer.parseInt(JOptionPane.showInputDialog(" ingrese la edad "));
        e1.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog(" ingrese numero telefonico "));
        e1.salary = Double.parseDouble(JOptionPane.showInputDialog(" ingrese sueldo "));
        e1.hiredate = JOptionPane.showInputDialog(" ingrese fecha de contratacion ");
        
        e2.id = 2;
        e2.firstName = JOptionPane.showInputDialog(" ingrese nombre ");
        e2.lastName = JOptionPane.showInputDialog(" ingrese apellido ");
        e2.age = Integer.parseInt(JOptionPane.showInputDialog(" ingrese la edad "));
        e2.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog(" ingrese numero telefonico "));
        e2.salary = Double.parseDouble(JOptionPane.showInputDialog(" ingrese sueldo "));
        e2.hiredate = JOptionPane.showInputDialog(" ingrese fecha de contratacion ");
        
        e1.getDetails();
        System.out.println("________________________");
        e2.getDetails();
        
                                    
    }
    
}
