/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author VINICIUS_4820
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return
            DriverManager.getConnection("jdbc:mysql://localhost/projeto_java","root","");
        }
    
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}