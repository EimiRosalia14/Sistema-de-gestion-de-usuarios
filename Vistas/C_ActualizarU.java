/*
    AMY ROSALIA PEREZ RAMIREZ, 2022-2113
*/
package Vistas;

import Clases.Conexion;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class C_ActualizarU extends javax.swing.JFrame {

    private Usuario usuario;
    private Inicio ventanaInicio;

    public C_ActualizarU() {
        initComponents();
    }
    
    public C_ActualizarU(Usuario usuario, Inicio ventanaInicio) {
        initComponents();
        this.usuario = usuario;
        this.ventanaInicio = ventanaInicio;
        llenarCampos();
        
        TxtUsuarioB.setBackground(new java.awt.Color(0, 0, 0, 1));
        TxtNombreB.setBackground(new java.awt.Color(0, 0, 0, 1));
        TxtApellidoB.setBackground(new java.awt.Color(0, 0, 0, 1));
        TxtTelefonoB.setBackground(new java.awt.Color(0, 0, 0, 1));
        TxtCorreoB.setBackground(new java.awt.Color(0, 0, 0, 1));
        TxtContraseñaB.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    private void llenarCampos() {
        TxtUsuarioB.setText(usuario.getNombreUsuario());
        TxtNombreB.setText(usuario.getNombre());
        TxtApellidoB.setText(usuario.getApellido());
        TxtTelefonoB.setText(usuario.getTelefono());
        TxtCorreoB.setText(usuario.getCorreoElectronico());
        llenarContraseña(usuario.getNombreUsuario());
    }
    
    private void llenarContraseña(String nombreUsuario) {
    Connection con = null;
    try {
        con = Conexion.getInstance().getConnection();
        String sql = "SELECT Contrasena FROM Usuarios WHERE Nombre_usuario=?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, nombreUsuario);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String contrasena = rs.getString("Contrasena");
                    TxtContraseñaB.setText(contrasena);
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al obtener la contraseña: " + e.getMessage());
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtApellidoB = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtTelefonoB = new javax.swing.JTextField();
        TxtCorreoB = new javax.swing.JTextField();
        TxtContraseñaB = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        TxtNombreB = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        BtnActualizarUsuario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TxtUsuarioB = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        TxtApellidoB.setFont(TxtApellidoB.getFont());
        TxtApellidoB.setForeground(new java.awt.Color(255, 255, 255));
        TxtApellidoB.setBorder(null);
        jPanel1.add(TxtApellidoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, 20));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("_____________________");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 170, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("_____________________");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 170, -1));

        TxtTelefonoB.setFont(TxtTelefonoB.getFont());
        TxtTelefonoB.setForeground(new java.awt.Color(255, 255, 255));
        TxtTelefonoB.setBorder(null);
        jPanel1.add(TxtTelefonoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, 20));

        TxtCorreoB.setFont(TxtCorreoB.getFont());
        TxtCorreoB.setForeground(new java.awt.Color(255, 255, 255));
        TxtCorreoB.setBorder(null);
        jPanel1.add(TxtCorreoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 120, 20));

        TxtContraseñaB.setFont(TxtContraseñaB.getFont());
        TxtContraseñaB.setForeground(new java.awt.Color(255, 255, 255));
        TxtContraseñaB.setBorder(null);
        jPanel1.add(TxtContraseñaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 120, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        TxtNombreB.setFont(TxtNombreB.getFont());
        TxtNombreB.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombreB.setBorder(null);
        jPanel1.add(TxtNombreB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 120, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("_____________________");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 170, -1));

        BtnActualizarUsuario.setBackground(new java.awt.Color(185, 5, 5));
        BtnActualizarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnActualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizarUsuario.setText("Actualizar");
        BtnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BtnActualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 330, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre de usuario:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        TxtUsuarioB.setFont(TxtUsuarioB.getFont());
        TxtUsuarioB.setForeground(new java.awt.Color(255, 255, 255));
        TxtUsuarioB.setBorder(null);
        jPanel1.add(TxtUsuarioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, 20));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("_____________________");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 170, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ActualizarUsuario.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 150, 140));

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
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 30));

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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(481, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarUsuarioActionPerformed

        actualizarUsuarioEnBaseDeDatos();
        this.setVisible(false);
        ventanaInicio.setVisible(true);
        ventanaInicio.actualizarTabla();
        
    }//GEN-LAST:event_BtnActualizarUsuarioActionPerformed

    private void actualizarUsuarioEnBaseDeDatos() {
    Connection con = null;
    try {
        con = Conexion.getInstance().getConnection();
        String sql = "UPDATE Usuarios SET Nombre_usuario=?, Nombre=?, Apellido=?, Telefono=?, Correo_electronico=?, Contrasena=? WHERE Nombre_usuario=?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, TxtUsuarioB.getText()); 
            pst.setString(2, TxtNombreB.getText());
            pst.setString(3, TxtApellidoB.getText());
            pst.setString(4, TxtTelefonoB.getText());
            pst.setString(5, TxtCorreoB.getText());
            pst.setString(6, TxtContraseñaB.getText());
            pst.setString(7, usuario.getNombreUsuario());

            int resultado = pst.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(this, "Usuario actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el usuario.");
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar usuario: " + e.getMessage());
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
    
    
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked


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
            java.util.logging.Logger.getLogger(C_ActualizarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_ActualizarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_ActualizarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_ActualizarU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_ActualizarU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarUsuario;
    private javax.swing.JTextField TxtApellidoB;
    private javax.swing.JPasswordField TxtContraseñaB;
    private javax.swing.JTextField TxtCorreoB;
    private javax.swing.JTextField TxtNombreB;
    private javax.swing.JTextField TxtTelefonoB;
    private javax.swing.JTextField TxtUsuarioB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    // End of variables declaration//GEN-END:variables
}
