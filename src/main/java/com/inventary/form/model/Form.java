/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventary.form.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "inventary")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String provider;
    
    private String description;
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return name; }
    public void setNombre(String name) { this.name = name; }

    public String getEmail() { return provider; }
    public void setEmail(String provider) { this.provider = provider; }

    public String getComentario() { return description; }
    public void setComentario(String description) { this.description = description; }
}
