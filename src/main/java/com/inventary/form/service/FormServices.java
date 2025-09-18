/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventary.form.service;

import com.inventary.form.model.Form;
import com.inventary.form.repository.FormRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServices {
    private final FormRepository formRepository;
    
    public FormServices(FormRepository formRepository){
        this.formRepository = formRepository;
    }
    
    public Form create(Form form) {return formRepository.save(form);}
    
    public List<Form> findAll() { return formRepository.findAll(); }
    
    public Form findById(Long id) { return formRepository.findById(id).orElseThrow(); }
    
    public void delete(Long id) { formRepository.deleteById(id); }
}
