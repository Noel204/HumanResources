package Conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/*Noel Franciscoco Garcia Trejo
Matricula: 2022580*/

public class conexion {
    Connection con;
    public conexion(){
        String driver ="com.mysql.jdbc.Driver";
        String url= "jdbc:mysql://localhost:3306/humanresources";
        try{
            Class.forName(driver);
            con= DriverManager.getConnection(url, "root", "root");
      
    } catch (Exception e){
    }
}
    public Connection getConnection(){
        return con;
    }
}
 /* public static void main(String[] args){
    //1. REQUERIMIENTOS;
    String driver = "com.mysql.jdbc.Driver";
    //2. URL (CADENA DE CONEXION):
    String url = "jdbc:mysql://localhost:3306/humanresources";
    try{
    Class.forName(driver);
    System.out.println("conexion exitosa");
    }catch (Exception e){
        System.err.println("Error de conexion!!!"+e.getMessage());
        return;
    }
    try{
        Connection cn = DriverManager.getConnection(url , "root", "root");
        System.out.println("Conectados a la base de datos");
        System.out.println("----------------------------");
        
        String sql="select * from  employee";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
                while(rs.next()){
                    System.out.println(rs.getInt(1));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                    System.out.println(rs.getDouble(4));
                    System.out.println(rs.getInt(5));
                    System.out.println(rs.getDouble(6));
                    System.out.println(rs.getString(7));
                    System.out.println("------------------");
                }
                while(rs.next()){
                    System.out.println(rs.getInt("id"));
                    System.out.println(rs.getString("firstName"));
                    System.out.println(rs.getString("lastName"));
                    System.out.println(rs.getDouble("age"));
                    System.out.println(rs.getInt("phoneNumber"));
                    System.out.println(rs.getDouble("salary"));
                    System.out.println(rs.getString("hiredate"));
                    System.out.println("------------------");
                }
    }catch (Exception e){
        System.err.println("Sin conexion a la base de datos");
        return;
    }    
}*/
