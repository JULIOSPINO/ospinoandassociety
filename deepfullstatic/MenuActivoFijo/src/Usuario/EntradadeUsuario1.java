/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.awt.Window;
import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menuactivofijo.Principal;

/**
 *
 * @author OSPINO Y ASOCIADO
 */
public class EntradadeUsuario1 extends javax.swing.JDialog {
 Object poder;
    /**
     * Creates new form EntradadeUsuario1
     */
    public EntradadeUsuario1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        buscarusu();
    }
//public void buscar1() {
//        try {
//
//            Connection Conec;
//            Statement sentencia;
//            ResultSet resultado1;
//            String url, instruccion;
//            Class.forName("com.mysql.jdbc.Driver");
//            url = "jdbc:mysql://localhost:3306/" + "atcivofijo";
//            Conec = (Connection) DriverManager.getConnection(url, "root", "");
//            String nombre = Nombre.getText();
//            String password = pasabordo.getText();
//            instruccion = "select Nombre from administrador where pasabordo='" + pasabordo.getText() + "' && nombre='"+Nombre.getText()+"'";
//            sentencia = Conec.createStatement();
////JOptionPane.showMessageDialog(this,"instrucciÃ³n es: \n"+instruccion);
//
//            resultado1 = sentencia.executeQuery(instruccion);
//            if (resultado1.next()) {
//                Usuarios.main((JFrame) this.getOwner());
//                Grilla.jLabel1.setText(resultado1.getString("Nombre"));
////                Principal.jLabel2.setText(resultado1.getString("Nivel"));
//                this.dispose();
//
//            } else {
//               JOptionPane.showMessageDialog(this, "ERROR el Usuario o Clave no son correcto verifique y intente de Nuevo ");
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "ERROR" + e);
//        }
//
//    }
    public void buscarusu() {
        try {

            ResultSet resultado1 = Usuarios.c.MysqlConsulta("select nombre from administrador ");
//resultado1 = sentencia.executeQuery(instruccion);
            if (resultado1.next()) {
                Nombre.setText(resultado1.getString("Nombre"));
            } else {
                JOptionPane.showMessageDialog(this, "Error");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR" + e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pasabordo = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Pasabordo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText(" Nombre:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));
        jPanel1.add(pasabordo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Candados y Cerraduras Forte   Cilindro convencional.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 330, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           try {
           
            ResultSet resultado1 = Usuarios.c.MysqlConsulta("select Nombre from administrador where nombre='"+Nombre.getText()+"' && pasabordo='"+pasabordo.getText()+"'");     
            if(resultado1.next()){
                 Usuarios.main((JFrame) this.getOwner());
                 Grilla.jLabel1.setText(resultado1.getString("Nombre"));
                  dispose();
                   JDialog get = Usuarios.di.get("Grilla");
        if(get!=null){
           this.poder = get;
           get.setVisible(true);
          
        }  
                
//                this.setVisible(false);
         
            }else{
                JOptionPane.showMessageDialog(this, "Este usuario no existe");
            }      
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en la conexion a la base de datos");
        }
//           this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        this.setVisible(false);
     dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
      dispose();
    }//GEN-LAST:event_formWindowClosing

     
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */

        /*
         * Create and display the dialog
         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                EntradadeUsuario1 dialog = new EntradadeUsuario1(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField pasabordo;
    // End of variables declaration//GEN-END:variables
}
