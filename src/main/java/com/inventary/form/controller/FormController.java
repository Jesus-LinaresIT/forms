/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventary.form.controller;

import com.inventary.form.model.Form;
import com.inventary.form.service.FormServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forms")
public class FormController {
    private final FormServices formServices;
    
    public FormController(FormServices formServices){
        this.formServices = formServices;
    }
    
    @PostMapping
    public ResponseEntity<Form> create(@RequestBody Form form){
        return ResponseEntity.ok(formServices.create(form));
    }
    
    @GetMapping
    public List<Form> findAll() { return formServices.findAll(); }
    
    @GetMapping("/{id}")
    public ResponseEntity<Form> findById(@PathVariable Long id){
        return ResponseEntity.ok(formServices.findById(id));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        formServices.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
