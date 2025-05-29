/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author VINICIUS_4820
 */
public class Usuario {
    private Long id;
    private int idade;
    private String nome, cpf, email, telefone, sobrenome;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId (Long id) {
        this.id = id;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome (String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade (int idade) {
        this.idade = idade;
    }
}
