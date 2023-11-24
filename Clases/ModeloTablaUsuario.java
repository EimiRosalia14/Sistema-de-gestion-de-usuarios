/*
    AMY ROSALIA PEREZ RAMIREZ, 2022-2113
*/
package Clases;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaUsuario extends AbstractTableModel {
    private final ArrayList<Usuario> usuarios;
    private final String[] columnas = {"Nombre de usuario", "Nombre", "Apellido", "Teléfono", "Correo electrónico"};

    public ModeloTablaUsuario(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getNombreUsuario();
            case 1:
                return usuario.getNombre();
            case 2:
                return usuario.getApellido();
            case 3:
                return usuario.getTelefono();
            case 4:
                return usuario.getCorreoElectronico();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
    public Usuario getUsuarioAt(int rowIndex) {
        return usuarios.get(rowIndex);
    }

    public void eliminarUsuario(int rowIndex) {
        usuarios.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
