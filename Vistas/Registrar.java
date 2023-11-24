/*
    AMY ROSALIA PEREZ RAMIREZ, 2022-2113
*/
package Vistas;

import Clases.Conexion;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JFrame {

    public Registrar() {
        initComponents();
        
        TxtUsuarioR.setBackground(new java.awt.Color(0,0,0,1));
        TxtNombreR.setBackground(new java.awt.Color(0,0,0,1));
        TxtApellidoR.setBackground(new java.awt.Color(0,0,0,1));
        TxtTelefonoR.setBackground(new java.awt.Color(0,0,0,1));
        TxtCorreoR.setBackground(new java.awt.Color(0,0,0,1));
        TxtContraseñaR.setBackground(new java.awt.Color(0,0,0,1));
        TxtConfirmarContraseñaR.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtUsuarioR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtApellidoR = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtNombreR = new javax.swing.JTextField();
        TxtTelefonoR = new javax.swing.JTextField();
        TxtCorreoR = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TxtContraseñaR = new javax.swing.JPasswordField();
        TxtConfirmarContraseñaR = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Registrar-usuario.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 105, 241, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 510));

        jPanel2.setBackground(new java.awt.Color(185, 5, 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(199, 226, 255));
        jLabel3.setText("Inicia sesión!");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 226, 255));
        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Apellido:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(199, 226, 255));
        jLabel6.setText("Teléfono:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 226, 255));
        jLabel7.setText("Correo electrónico:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(199, 226, 255));
        jLabel8.setText("Contraseña:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 226, 255));
        jLabel9.setText("Confirmar contraseña:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Registro de usuarios");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 350, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("___________________________________________________");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 410, -1));

        TxtUsuarioR.setFont(TxtUsuarioR.getFont());
        TxtUsuarioR.setForeground(new java.awt.Color(255, 255, 255));
        TxtUsuarioR.setBorder(null);
        TxtUsuarioR.setMinimumSize(new java.awt.Dimension(64, 20));
        jPanel2.add(TxtUsuarioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 258, 20));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("_____________________");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("_____________________");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 170, -1));

        TxtApellidoR.setFont(TxtApellidoR.getFont());
        TxtApellidoR.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellidoR.setBorder(null);
        jPanel2.add(TxtApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 120, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("_____________________");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("_____________________");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 170, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("_____________________");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 170, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("_____________________");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 170, -1));

        TxtNombreR.setFont(TxtNombreR.getFont());
        TxtNombreR.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombreR.setBorder(null);
        jPanel2.add(TxtNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 20));

        TxtTelefonoR.setFont(TxtTelefonoR.getFont());
        TxtTelefonoR.setForeground(new java.awt.Color(255, 255, 255));
        TxtTelefonoR.setBorder(null);
        jPanel2.add(TxtTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 120, 20));

        TxtCorreoR.setFont(TxtCorreoR.getFont());
        TxtCorreoR.setForeground(new java.awt.Color(255, 255, 255));
        TxtCorreoR.setBorder(null);
        jPanel2.add(TxtCorreoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 120, 20));

        BtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnRegistrar.setForeground(new java.awt.Color(185, 5, 5));
        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 360, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(199, 226, 255));
        jLabel12.setText("Nombre de usuario:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 260, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(199, 226, 255));
        jLabel19.setText("Ya tienes una cuenta?");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 130, -1));

        TxtContraseñaR.setFont(TxtContraseñaR.getFont());
        TxtContraseñaR.setForeground(new java.awt.Color(255, 255, 255));
        TxtContraseñaR.setBorder(null);
        jPanel2.add(TxtContraseñaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 120, 20));

        TxtConfirmarContraseñaR.setFont(TxtConfirmarContraseñaR.getFont());
        TxtConfirmarContraseñaR.setForeground(new java.awt.Color(255, 255, 255));
        TxtConfirmarContraseñaR.setBorder(null);
        jPanel2.add(TxtConfirmarContraseñaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 120, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cerrar-programa.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 510));

        setSize(new java.awt.Dimension(749, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        String Usuario = TxtUsuarioR.getText();
        String Nombre = TxtNombreR.getText();
        String Apellido = TxtApellidoR.getText();
        String Telefono = TxtTelefonoR.getText();
        String Correo = TxtCorreoR.getText();
        String Contraseña = TxtContraseñaR.getText();
        String ConfirmarC = TxtConfirmarContraseñaR.getText();
        
        if (Usuario.isEmpty() || Nombre.isEmpty() || Apellido.isEmpty() || Telefono.isEmpty() || Correo.isEmpty() || 
            Contraseña.isEmpty() || ConfirmarC.isEmpty()) {
            
            JOptionPane.showMessageDialog(rootPane, "Por favor, complete todos los campos obligatorios.");
        } else if (Contraseña.equals(ConfirmarC)) {
            try {
            Statement S = Conexion.getInstance().getConnection().createStatement();
            S.executeUpdate(" INSERT INTO Usuarios (Nombre_usuario, Nombre, Apellido, Telefono, Correo_electronico, Contrasena)"
            + "VALUES ('"+Usuario+"', '"+Nombre+"', '"+Apellido+"', '"+Telefono+"', '"+Correo+"', '"+Contraseña+"')");
            
            JOptionPane.showMessageDialog(rootPane, "Cuenta creada. Inicia sesión!");
            } catch (Exception e){ 
                System.out.println(e);
            }
            
            TxtUsuarioR.setText("");
            TxtNombreR.setText("");
            TxtApellidoR.setText("");
            TxtTelefonoR.setText("");
            TxtCorreoR.setText("");
            TxtContraseñaR.setText("");
            TxtConfirmarContraseñaR.setText("");
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Las contraseñas no coinciden.");
        }
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel20MouseClicked

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JTextField TxtApellidoR;
    private javax.swing.JPasswordField TxtConfirmarContraseñaR;
    private javax.swing.JPasswordField TxtContraseñaR;
    private javax.swing.JTextField TxtCorreoR;
    private javax.swing.JTextField TxtNombreR;
    private javax.swing.JTextField TxtTelefonoR;
    private javax.swing.JTextField TxtUsuarioR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
