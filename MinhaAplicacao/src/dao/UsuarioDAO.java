/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author VINICIUS_4820
 */
public class UsuarioDAO {
    private Connection connection;
    
    Long id;
    int idade;
    String nome, cpf, email, telefone, sobrenome;
    
    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Usuario usuario){
        String sql = "INSERT INTO usuario (nome, cpf, email, telefone, idade, sobrenome) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString (1, usuario.getNome());
            stmt.setString (2, usuario.getCpf());
            stmt.setString (3, usuario.getEmail());
            stmt.setString (4, usuario.getTelefone());
            stmt.setInt (5,usuario.getIdade());
            stmt.setString (6,usuario.getSobrenome());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException (u);
        }
    }
}
