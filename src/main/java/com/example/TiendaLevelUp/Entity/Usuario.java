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
    private int empId;
    
    @Column(name="firstName")
    private String firstName;
    
    @Column(name="lastName")
    private String lastName;
    
    @Column(name="email", nullable =false, length=200)
    private String email;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }
    
}
