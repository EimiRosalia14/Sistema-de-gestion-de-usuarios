/*
    AMY ROSALIA PEREZ RAMIREZ, 2022-2113
*/
package Vistas;

import Clases.Conexion;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class C_AgregarU extends javax.swing.JFrame {

    public C_AgregarU() {
        initComponents();
        
        TxtUsuarioA.setBackground(new java.awt.Color(0,0,0,1));
        TxtNombreA.setBackground(new java.awt.Color(0,0,0,1));
        TxtApellidoA.setBackground(new java.awt.Color(0,0,0,1));
        TxtTelefonoA.setBackground(new java.awt.Color(0,0,0,1));
        TxtCorreoA.setBackground(new java.awt.Color(0,0,0,1));
        TxtContraseñaA.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtApellidoA = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtNombreA = new javax.swing.JTextField();
        TxtTelefonoA = new javax.swing.JTextField();
        TxtCorreoA = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        TxtContraseñaA = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        TxtUsuarioA = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(199, 226, 255));
        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 226, 255));
        jLabel7.setText("Correo electrónico:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(199, 226, 255));
        jLabel8.setText("Contraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("_____________________");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 170, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("_____________________");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 170, -1));

        TxtApellidoA.setFont(TxtApellidoA.getFont());
        TxtApellidoA.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellidoA.setBorder(null);
        jPanel1.add(TxtApellidoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("_____________________");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 170, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("_____________________");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 170, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("_____________________");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 170, -1));

        TxtNombreA.setFont(TxtNombreA.getFont());
        TxtNombreA.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombreA.setBorder(null);
        jPanel1.add(TxtNombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 120, 20));

        TxtTelefonoA.setFont(TxtTelefonoA.getFont());
        TxtTelefonoA.setForeground(new java.awt.Color(255, 255, 255));
        TxtTelefonoA.setBorder(null);
        jPanel1.add(TxtTelefonoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, 20));

        TxtCorreoA.setFont(TxtCorreoA.getFont());
        TxtCorreoA.setForeground(new java.awt.Color(255, 255, 255));
        TxtCorreoA.setBorder(null);
        jPanel1.add(TxtCorreoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 120, 20));

        BtnAgregar.setBackground(new java.awt.Color(185, 5, 5));
        BtnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setText("Guardar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 330, 40));

        TxtContraseñaA.setFont(TxtContraseñaA.getFont());
        TxtContraseñaA.setForeground(new java.awt.Color(255, 255, 255));
        TxtContraseñaA.setBorder(null);
        jPanel1.add(TxtContraseñaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 120, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        TxtUsuarioA.setForeground(new java.awt.Color(255, 255, 255));
        TxtUsuarioA.setBorder(null);
        jPanel1.add(TxtUsuarioA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("_____________________");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/AgregarUsuario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cerrar-programa.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Flecha-volver-atras.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 480));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("_____________________");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, -1));

        setSize(new java.awt.Dimension(488, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        String Usuario = TxtUsuarioA.getText();
        String Nombre = TxtNombreA.getText();
        String Apellido = TxtApellidoA.getText();
        String Telefono = TxtTelefonoA.getText();
        String Correo = TxtCorreoA.getText();
        String Contraseña = TxtContraseñaA.getText();

        if (Usuario.isEmpty() || Nombre.isEmpty() || Apellido.isEmpty() || Telefono.isEmpty() || Correo.isEmpty() ||
            Contraseña.isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Por favor, complete todos los campos obligatorios.");
        } else {
            try {
                Statement S = Conexion.getInstance().getConnection().createStatement();
                S.executeUpdate(" INSERT INTO Usuarios (Nombre_usuario, Nombre, Apellido, Telefono, Correo_electronico, Contrasena)"
                    + "VALUES ('"+Usuario+"', '"+Nombre+"', '"+Apellido+"', '"+Telefono+"', '"+Correo+"', '"+Contraseña+"')");

                JOptionPane.showMessageDialog(rootPane, "Usuario guardado.");
                new Inicio().setVisible(true);
                this.setVisible(false);
            } catch (Exception e){
                System.out.println(e);
            }

            TxtUsuarioA.setText("");
            TxtNombreA.setText("");
            TxtApellidoA.setText("");
            TxtTelefonoA.setText("");
            TxtCorreoA.setText("");
            TxtContraseñaA.setText("");

        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(C_AgregarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_AgregarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_AgregarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_AgregarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_AgregarU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JTextField TxtApellidoA;
    private javax.swing.JPasswordField TxtContraseñaA;
    private javax.swing.JTextField TxtCorreoA;
    private javax.swing.JTextField TxtNombreA;
    private javax.swing.JTextField TxtTelefonoA;
    private javax.swing.JTextField TxtUsuarioA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
