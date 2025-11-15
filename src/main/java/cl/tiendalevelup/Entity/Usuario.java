package cl.tiendalevelup.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="USUARIO")
public class Usuario {

    @Id
    @GeneratedValue
    private int usuarioId;

    @Column(name="primernom")
    private String primerNom;

    @Column(name="apellido")
    private String apellido;

    @Column(name="email", nullable = false, length = 200)
    private String email;

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getPrimerNom() {
        return primerNom;
    }

    public void setPrimerNom(String primerNom) {
        this.primerNom = primerNom;
    }

    public String getApellido() {
        return apellido;
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
        return "Usuario{" +
                "usuarioId=" + usuarioId +
                ", primerNom='" + primerNom + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
