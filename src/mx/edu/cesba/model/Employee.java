/*
Noel Franciscoco Garcia Trejo
Matricula: 2022580

*/
package mx.edu.cesba.model;

/**
 *
 * @author Noel
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int phoneNumber;
    private double salary;
    private String hiredate;
    
    public void setId(int id){
        this.id = id;
    } 
    public int getId(){
        return id;
    
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getfirstName(){
        return firstName;
    }
    public void setage(int age){
        this.age = age;
    }
    
    public int getage(){
        return age;
    }
    
    public void setlastName(String firstName){
        this.lastName = lastName;
    }
    
    public String getlastName(){
        return lastName;
    }
    
    public void setphoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getphoneNumber(){
        return phoneNumber;
    }
    
    public void setsalary(double salary){
        this.salary = salary;
    }
    public double getsalary(){
        return salary;
    }
    public void sethiredate(String hiredate){
        this.hiredate = hiredate;
    }
    public String gethiredate(){
        return hiredate;
    }
    
    
    
    
    
    
    
    public void getDetails(){//METODO
           System.out.println("id"+ id);
           System.out.println("firstName"+ firstName);
           System.out.println("lastName"+ lastName);
           System.out.println("age"+ age);
           System.out.println("phoneNumber"+ phoneNumber);
           System.out.println("salary"+ salary);
           System.out.println("hiredate"+ hiredate);
}
}
