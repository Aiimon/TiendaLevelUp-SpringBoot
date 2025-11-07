package com.example.TiendaLevelUp.Entity;

import jakarta.persistence.*;

/**
 *
 * @author Stivi
 */
@Entity
@Table(name="USUARIO")
public class Usuario {
    
    @Id
    @GeneratedValue
    private int usuarioId;
    
    @Column(name="primernom")
    private String primernom;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="email", nullable =false, length=200)
    private String email;

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setusuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getPrimerNom() {
        return primernom;
    }

    public void setPrimerNom(String primernom) {
        this.primernom = primernom;
    }

    public String getApellido() {
        return primernom;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuarioId=" + usuarioId + ", primernom=" + primernom + ", apellido=" + apellido + ", email=" + email + '}';
    }
    
}
