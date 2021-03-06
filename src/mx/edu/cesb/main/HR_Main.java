/*
Noel Franciscoco Garcia Trejo
Matricula: 2022580

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
        
        
        e1.setId  (1);
        e1.setfirstName ( JOptionPane.showInputDialog(" ingrese nombre "));
        e1.setlastName ( JOptionPane.showInputDialog(" ingrese apellido "));
        e1.setage ( Integer.parseInt(JOptionPane.showInputDialog(" ingrese la edad ")));
        e1.setphoneNumber ( Integer.parseInt(JOptionPane.showInputDialog(" ingrese numero telefonico ")));
        e1.setsalary ( Double.parseDouble(JOptionPane.showInputDialog(" ingrese sueldo ")));
        e1.sethiredate ( JOptionPane.showInputDialog(" ingrese fecha de contratacion "));
        
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
