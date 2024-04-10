package com.example.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ModelConection {
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
    }
}
