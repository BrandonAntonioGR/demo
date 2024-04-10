package com.example.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.entity.Usuario;

public class ConsultaUsuario {
    public static Usuario consultaOficio() {
        Connection con;
        PreparedStatement ps;
        try {            
            con = ModelConection.getConnection();
            ps = con.prepareStatement("SELECT TOP (1) [name]\n" +
                "  FROM [DC REPORT].[dbo].[users_macro]");
            ResultSet rs = ps.executeQuery();
            Usuario usuario = new Usuario();
            while (rs.next()) {
                usuario.setUsuario(rs.getString("name"));
            }
            cerrarConexion(con, ps, rs);
            return usuario;
        } catch (Exception e) {
            System.out.println("Error en ConsultaAgentes: " + e);
            return null;
        }

    }

    public static void cerrarConexion(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
        con.close();
        ps.close();
        rs.close();
    }
}
