/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traslados;

import activosfijos.ModelosTabla;
import activosfijos.ModelosTablaT;
import activosfijos.RenderCelda;
import areas.ClasArea;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableCellRenderer;
import productos.Producto;
import responsables.GrillaResponsable;

/**
 *
 * @author Noel Acevedo
 */
public class TrasladodeAtivo extends javax.swing.JDialog {

    private ModelosTablaT tm1;
    private final ModelosTabla tm3;
    private final ModelosTabla tm2;
    private LinkedList<String> Envia;

    /**
     * Creates new form TrasladodeAtivo
     */
    public TrasladodeAtivo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        String[] columna = {"codeactivofijo", "serie", "marca", "modelo", "estado", "fabricantedelproducto", "distribuidor", "Seleccion"};
        this.tm1 = new ModelosTablaT(columna, jTable1);
        jTable1.setModel(tm1);
        TableCellRenderer renderer1 = new RenderCelda();
        try {
            jTable1.setDefaultRenderer(Class.forName("java.lang.Object"), renderer1);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error en setdefaultRender");
        }
        String[] columnas = {"Indice", "codecontable", "nameproducto", "cantidad", "valorTotal"};
        this.tm3 = new ModelosTabla(columnas, jTable3);
        jTable3.setModel(tm3);

        String[] columnasi = {"Indice", "codecontable", "nameproducto", "cantidad", "valorTotal"};
        this.tm2 = new ModelosTabla(columnasi, jTable2);
        jTable2.setModel(tm2);
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Id Responsable Enviar"));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion"));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 400, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder("Id Responsable Recibido"));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 140, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder("N° item"));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 830, 100));

        jButton1.setText("Seleccionar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jButton2.setText("Desseleccionar todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jButton3.setText("Registrar seleccionados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jButton4.setText("Cancelar");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 410, 110));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 410, 110));

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 30, -1));

        jButton6.setText("jButton5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 30, -1));

        jButton7.setText("Cambiar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     Este metodo sirve para llamar la grilla de responsable para
     escoger un responsable del cual se quieran sacar activos
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        /*
         Aqui estoy sacando de la coleccion are la intergaz de grilla responsable
         y la estoy almacenando en la variable get
         */
        GrillaResponsable get = (GrillaResponsable) ClasArea.are.get("grillarepons");
        /*
         como get es la interfaz de grilla responsable yo 
         */
        get.quienPide(2);
        get.setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
//        if (validacion()) {
        GrillaResponsable get = (GrillaResponsable) ClasArea.are.get("grillarepons");
        get.quienPide(3);
        get.setVisible(true);
//        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
          jTable3.getValueAt(jTable3.getSelectedRow(), 0);
            if(productosEnvianExisten()){
            this.odtenerProductosT1();
            }
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tm1.getUsuarios().size(); i++) {
            tm1.setValueAt(true, i, 7);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tm1.getUsuarios().size(); i++) {
            tm1.setValueAt(false, i, 7);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //        trasladarActivos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//        try {
//            // TODO add your handling code here:
//            Producto.c.EjecutarMysql("use biblioteca1");
//        } catch (SQLException ex) {
//            Logger.getLogger(TrasladodeAtivo.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton7ActionPerformed
    /**
     * Con este metodo voy a modificar el campo de texto del Resposable que
     * envia
     *
     * @param jTextField1
     * @param idResponsable
     */
    public void setjTextField1(String jTextField1, String idResponsable) {
        if (validacion(jTextField1, true)) {
            this.jTextField1.setText(jTextField1);
            consulteR(idResponsable);
        }
    }

    /**
     * Con este metodo voy a modificar el campo de texto del Resposable que
     * recibe
     *
     * @param identificacionResponsable
     * @param indiceResponsable
     */
    public void setjTextField3(String identificacionResponsable, String indiceResponsable) {
        if (validacion(identificacionResponsable, false)) {
            this.jTextField3.setText(identificacionResponsable);
            consulteR2(indiceResponsable);
        }
    }

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
            java.util.logging.Logger.getLogger(TrasladodeAtivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrasladodeAtivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrasladodeAtivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrasladodeAtivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TrasladodeAtivo dialog = new TrasladodeAtivo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void consulteR(String idResponsable) {
        try {
            //        SELECT *
            //        FROM  `detallesaldoactivo`
            //        WHERE  `indiceRe` LIKE  '1'
            //        LIMIT 0 , 30
            ResultSet resultado1 = Producto.c.MysqlConsulta("SELECT * FROM  `detallesaldoactivo` WHERE  `indiceRe` LIKE  '" + idResponsable + "'");
            while (resultado1.next()) {
                Object k[] = {resultado1.getString("Indice"), resultado1.getString("codecontable"), resultado1.getString("nameproducto"), resultado1.getString("cantidad"), resultado1.getString("valorTotal")};
                tm3.ingresarUsuario(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrasladodeAtivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void consulteR2(String idResponsable) {
        try {
            //        SELECT *
            //        FROM  `detallesaldoactivo`
            //        WHERE  `indiceRe` LIKE  '1'
            //        LIMIT 0 , 30
            ResultSet resultado1 = Producto.c.MysqlConsulta("SELECT * FROM  `detallesaldoactivo` WHERE  `indiceRe` LIKE  '" + idResponsable + "'");
            while (resultado1.next()) {
                String k[] = {resultado1.getString("Indice"), resultado1.getString("codecontable"), resultado1.getString("nameproducto"), resultado1.getString("cantidad"), resultado1.getString("valorTotal")};
                tm2.ingresarUsuario(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrasladodeAtivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean validacion(String a, boolean t) {
        if (t) {

            if (!jTextField3.getText().equals(a)) {
                return true;
            }
        } else {

            if (!jTextField1.getText().equals(a)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Este metodo cambia los los saldos iniciales de un responsable a otro
     *
     * @param traslados Este parametro recibe los saldos que se pasaran al
     * receptor
     * @param emisor idResponsable al que perteneceran
     * @param receptor
     *
     */
    private void trasladarActivos(String traslados[], String emisor, String receptor) {

    }

    /**
     * Manda los resgistros coleccionados en los productos del responsable que envia,
     * en la tabla del inventario
     */
    private void odtenerProductosT1() {
        try {
            ResultSet resultado1 = Producto.c.MysqlConsulta("SELECT * FROM  `saldoactivo` WHERE  `indiceDs` LIKE  '" + jTable3.getValueAt(jTable3.getSelectedRow(), 0) + "'");
            while (resultado1.next()) {
                Object[] usuObjectsw = {
                    resultado1.getString("codeActivofijo"),
                    resultado1.getString("serie"),
                    resultado1.getString("marca"),
                    resultado1.getString("modelo"),
                    resultado1.getString("estado"),
                    resultado1.getString("fabricantedelproducto"),
                    resultado1.getString("distribuidor"),
                    new Boolean(false)
                };
                this.Envia.add(resultado1.getString("indiceDs"));
                tm1.ingresarUsuarioM(usuObjectsw);
            }
            tm1.reload();
             
        } catch (SQLException ex) {
            Logger.getLogger(TrasladodeAtivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Con este metodo valido los productos que se van ha enviar a la grilla de 
     * especificacion de productos, voy a verificar que no se repitan
     * @return 
     */
    private boolean productosEnvianExisten() {
        int lastIndexOf = this.Envia.lastIndexOf(jTable3.getValueAt(jTable3.getSelectedRow(), 0));
        return (lastIndexOf != -1);
    }

}
