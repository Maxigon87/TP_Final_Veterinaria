/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Tratamiento;
import modelo.Conexion;

/**
 *
 * @author Maximiliano Gonzalez
 */
public class TratamientoData {
    
    private Connection con = null;
    private String sql;

    public TratamientoData(Conexion conexion) {

        con = conexion.getConexion();
    }
    
    public void agregarTratamiento(Tratamiento tratamiento) {
        try {
            sql = "INSERT INTO tratamiento (tipo, descripcion, medicamento, precio, activo, idConsulta, idMascota) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, (int) tratamiento.get
            ps.setString(2, tratamiento.getNombre());
            ps.setString(3, tratamiento.getApellido());
            ps.setString(4, tratamiento.getDireccion());
            ps.setInt(5, (int) tratamiento.getTelefono());
            ps.setString(6, tratamiento.getContactoAlternativo());
            ps.setBoolean(7, tratamiento.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                tratamiento.setIdtratamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agregó el tratamiento");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el tratamiento");

            }
            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error");
        }

    }
}
