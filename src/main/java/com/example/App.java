package com.example;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;*/

import javax.swing.JOptionPane;

import com.example.entity.Usuario;
import com.example.model.ConsultaUsuario;

public class App 
{
    public static void main( String[] args ){
        ConsultaUsuario co= new ConsultaUsuario();
        Usuario u= new Usuario();
        System.out.println( "Primer proyecto java con maven" );
        u=ConsultaUsuario.consultaOficio();
        JOptionPane.showMessageDialog(null, "El registro es: "+u.getUsuario(), "Exito", JOptionPane.INFORMATION_MESSAGE);
    }
/*
    public static Usuario consultaOficio() {
        Connection con;
        PreparedStatement ps;
        try {            
            con = getConnection();
            ps = con.prepareStatement("SELECT TOP (1) [name]\n" +
                "  FROM [DC REPORT].[dbo].[users_macro]");
            ResultSet rs = ps.executeQuery();
            Usuario u= new Usuario();
            while (rs.next()) {
                u.setUsuario(rs.getString("name"));
            }
            cerrarConexion(con, ps, rs);
            return u;
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

    public static Connection getConnection(){
        Connection con;
        try{
            String url="jdbc:sqlserver://192.168.1.38\\SQLEXPRESS;"
                    + "databaseName=DC REPORT;"
                    + "user=jcruz1;"
                    + "password=Jcruz*23;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection(url);
            System.out.print("Conectado!");
            return con;
        }catch(Exception e){
            System.out.print("Error en ModelConection: "+e);
            //JOptionPane.showMessageDialog(null, "Error en ModelConection: "+e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    } */
}
