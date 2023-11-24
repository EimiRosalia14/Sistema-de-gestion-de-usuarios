/*
    AMY ROSALIA PEREZ RAMIREZ, 2022-2113
*/
package Vistas;

import Clases.Conexion;
import Clases.Usuario;
import Clases.ModeloTablaUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class Inicio extends javax.swing.JFrame {
    
    private final Connection con;
    private ResultSet rs;
    private PreparedStatement pst;
    private Usuario usuarioSeleccionado;
   
    public Inicio() {
        initComponents();
        
        con = Conexion.getInstance().getConnection();
        rs = null;
        pst = null;

        cargarDatos();
    }
    
    public void cargarDatos() {
        Connection con = null;
        try {
            con = Conexion.getInstance().getConnection();
            String sql = "SELECT * FROM Usuarios";
            try (PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                ArrayList<Usuario> usuarios = new ArrayList<>();
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setNombreUsuario(rs.getString("Nombre_usuario"));
                    usuario.setNombre(rs.getString("Nombre"));
                    usuario.setApellido(rs.getString("Apellido"));
                    usuario.setTelefono(rs.getString("Telefono"));
                    usuario.setCorreoElectronico(rs.getString("Correo_electronico"));
                    usuarios.add(usuario);
                }

                ModeloTablaUsuario modeloTabla = new ModeloTablaUsuario(usuarios);
                jTable1.setModel(modeloTabla);
                ((AbstractTableModel) jTable1.getModel()).fireTableDataChanged();
            }
        } catch (Exception e) {
             e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Error al cargar datos: " + e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnCerrarSesion = new javax.swing.JButton();
        BtnNuevoUsuario = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Nombre", "Apellidos", "Telefono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 800, 281));

        BtnCerrarSesion.setBackground(new java.awt.Color(185, 5, 5));
        BtnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BtnCerrarSesion.setText("Cerrar sesión");
        BtnCerrarSesion.setBorder(null);
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 160, 35));

        BtnNuevoUsuario.setBackground(new java.awt.Color(185, 5, 5));
        BtnNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BtnNuevoUsuario.setText("Nuevo");
        BtnNuevoUsuario.setBorder(null);
        BtnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 160, 35));

        BtnEliminar.setBackground(new java.awt.Color(185, 5, 5));
        BtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setBorder(null);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 160, 35));

        BtnActualizar.setBackground(new java.awt.Color(185, 5, 5));
        BtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizar.setText("Actualizar");
        BtnActualizar.setBorder(null);
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 160, 35));

        jPanel2.setBackground(new java.awt.Color(185, 5, 5));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de usuarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186)
                .addComponent(jLabel3)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(901, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesionActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnCerrarSesionActionPerformed

    private void BtnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoUsuarioActionPerformed

        new C_AgregarU().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnNuevoUsuarioActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un usuario para eliminar.");
        return;
        }

        ModeloTablaUsuario modeloTabla = (ModeloTablaUsuario) jTable1.getModel();
        Usuario usuario = modeloTabla.getUsuarioAt(filaSeleccionada);

        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar este usuario?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
        eliminarUsuarioDeBaseDeDatos(usuario);
        modeloTabla.eliminarUsuario(filaSeleccionada);
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    
    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada != -1) {
            this.setVisible(false);
            
            ModeloTablaUsuario modeloTabla = (ModeloTablaUsuario) jTable1.getModel();
            usuarioSeleccionado = modeloTabla.getUsuarioAt(filaSeleccionada);
            abrirFormularioActualizar();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un usuario para actualizar.");
        }
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    
    private void abrirFormularioActualizar() {
        if (usuarioSeleccionado != null) {
            C_ActualizarU formularioActualizar = new C_ActualizarU(usuarioSeleccionado, this);
            formularioActualizar.setVisible(true);
        }
    }

    public void actualizarTabla() {
        cargarDatos();
    }
        
    private void eliminarUsuarioDeBaseDeDatos(Usuario usuario) {
    try {
        String sql = "DELETE FROM Usuarios WHERE Nombre_usuario=?";
        pst = con.prepareStatement(sql);
        pst.setString(1, usuario.getNombreUsuario());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al eliminar usuario: " + e.getMessage());
    }
}

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnNuevoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
