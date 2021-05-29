/*Noel Franciscoco Garcia Trejo
Matricula: 2022580*/
package login;

import Conexion.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Read extends javax.swing.JFrame {

    conexion con = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel model;
    
    public Read() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        this.setResizable(false);
        
        listar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_hiredate = new javax.swing.JTextField();
        btn_returnmenu = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTA DE EMPLEADOS");

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "firstName", "lastName", "Age", "PhoneNumber", "Salary", "HireDate"
            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        jLabel2.setText("ID");

        jLabel3.setText("FIRST NAME");

        jLabel4.setText("LAST NAME");

        jLabel5.setText("AGE");

        jLabel6.setText("PHONE");

        jLabel7.setText("SALARY");

        jLabel8.setText("HIRE DATE");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });

        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });
        txt_firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_firstnameKeyTyped(evt);
            }
        });

        txt_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastnameActionPerformed(evt);
            }
        });
        txt_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lastnameKeyTyped(evt);
            }
        });

        txt_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ageKeyTyped(evt);
            }
        });

        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });

        btn_returnmenu.setText("RETURN MENU");

        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_borrar.setForeground(new java.awt.Color(153, 0, 0));
        btn_borrar.setText("BORRAR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_consultar.setText("CONSULTAR");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/descarga.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_hiredate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(txt_salary, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_phone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_age, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_lastname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_firstname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(45, 45, 45)
                                .addComponent(btn_agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_borrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_actualizar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_consultar))))))
                    .addComponent(jScrollPane1))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_returnmenu)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_consultar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_hiredate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_returnmenu))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_id.setText("");
        txt_firstname.setText("");
        txt_lastname.setText("");
        txt_age.setText("");
        txt_phone.setText("");
        txt_salary.setText("");
        txt_hiredate.setText("");
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Agregar();
        consultar();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void txt_ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ageKeyTyped
        char solonumero = evt.getKeyChar();
        if (Character.isLetter(solonumero)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESAR SOLO NUMEROS");
        }
    }//GEN-LAST:event_txt_ageKeyTyped

    private void txt_firstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstnameKeyTyped
     char c = evt.getKeyChar();
     if (Character.isLowerCase(c)){
         String cad = ("" +c).toUpperCase();
         c= cad.charAt(0);
         evt.setKeyChar(c);
     }
     if (Character.isDigit(c)){
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(null, "INFRESAR SOLO TEXTO !!!");
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameKeyTyped

    private void txt_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastnameActionPerformed
   
     // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastnameActionPerformed

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void txt_lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastnameKeyTyped
       char c = evt.getKeyChar();
        
        if (Character.isLowerCase(c)) {
            
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        
       if (Character.isDigit(c)) {
           
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null, "INGRESAR SOLO TEXTO!!");
       }
       // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastnameKeyTyped

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        eliminar();        
        listar();
// TODO add your handling code here:
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed

        consultar();
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
char solonumero = evt.getKeyChar();
        
        if (Character.isLetter(solonumero)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESA SOLO NUMEROS");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
char solonumero = evt.getKeyChar();
        
        if (Character.isLetter(solonumero)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESA SOLO NUMEROS");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizar();
        listar();
              // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Read().setVisible(true);
            }
        });
    }
    void consultar(){
        String sql="select * from employee";
        try {
            cn =con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] empleado = new Object [7];
            model = (DefaultTableModel) TablaDatos.getModel();
            
            while (rs.next()) {
                empleado[0]= rs.getInt ("id");
                empleado[1]= rs.getString ("FirstName");
                empleado[2]= rs.getString ("LastName");
                empleado[3]= rs.getInt ("age");
                empleado[4]= rs.getInt ("phoneNumber");
                empleado[5]= rs.getDouble ("salary");
                empleado[6]= rs.getString ("hiredate");
                
                model.addRow(empleado);
            }
            TablaDatos.setModel(model);
        }catch (Exception e) {
            
        }
    }
    void listar(){
        String sql="select * from employee";
        try {
            cn =con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] empleado = new Object [7];
            model = (DefaultTableModel) TablaDatos.getModel();
            
            while (rs.next()) {
                empleado[0]= rs.getInt ("");
                empleado[1]= rs.getString ("");
                empleado[2]= rs.getString ("");
                empleado[3]= rs.getInt ("");
                empleado[4]= rs.getInt ("");
                empleado[5]= rs.getDouble ("");
                empleado[6]= rs.getString ("");
                
                model.addRow(empleado);
            }
            TablaDatos.setModel(model);
        }catch (Exception e) {
            
        }
    }
    void Agregar(){
     int id = Integer.parseInt(txt_id.getText());
String firstName = txt_firstname.getText();
String lastName = txt_lastname.getText();
int age = Integer.parseInt(txt_age.getText());
int phoneNumber = Integer.parseInt(txt_phone.getText());
Double salary = Double.parseDouble(txt_salary.getText());
String hiredate = (txt_hiredate.getText().trim());

try {
    String sql = "INSERT INTO employee (id, FirstName, LastName, age, phoneNumber, salary, hiredate) values ('" + id + "', '" + firstName + "', '" + lastName + "', '" + age + "', '" + phoneNumber + "', '" + salary + "', '" + hiredate + "')";
    cn = con.getConnection();
    st = cn.createStatement();
    st.executeUpdate(sql);

    JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
    limpiartable();
}catch (Exception e) {
    JOptionPane.showMessageDialog(null, "DATOS NO SE GUARDARON CORRECTAMENTE");
}
}
    void actualizar() {
        
        int id = Integer.parseInt(txt_id.getText());
        
        String firstname = txt_firstname.getText();
        String lastname = txt_lastname.getText();
        int age = Integer.parseInt(txt_age.getText());
        int phonenumber = Integer.parseInt(txt_phone.getText());
        double salary = Double.parseDouble(txt_salary.getText());
        String hiredate = (txt_hiredate.getText().trim());
        
        String sql = "UPDATE employee set id = '"+id+"', firstname = '"+firstname+"', lastname= '"+ lastname+"' , age= '"+ age+"' , phonenumber= '"+phonenumber+"' , salary= '"+ salary+"' , hiredate= '"+ hiredate+"' where id = "+id;
        
        try{
            cn = con.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "DATOS Actualizados CORRECTAMENTE");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "DATOS NO SE Actualizaron CORRECTAMENTE");
            limpiartable();
        }
      }
void limpiartable() {
     for (int i=0; i <= TablaDatos.getRowCount(); i++){
     model.removeRow(i);
     i=i-1;
}
}
void eliminar()   {
    int fila = TablaDatos.getRowCount();
    int id = Integer.parseInt(txt_id.getText());
    
    if(fila == -1){
        JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA PARA BORRAR REGISTRO");    
    }else{
        try{
            String sql = "DELETE FROM employee WHERE id="+id;
            cn = con.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "DATOS BORRADOS CORRECTAMENTE");
            
            limpiartable();
        }catch(Exception e){
            
        }
    } 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_returnmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hiredate;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_salary;
    // End of variables declaration//GEN-END:variables
}

