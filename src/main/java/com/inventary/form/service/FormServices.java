/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventary.form.service;

import com.inventary.form.model.Form;
import com.inventary.form.repository.FormRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FormServices {
    private final FormRepository formRepository;
    
    public FormServices(FormRepository formRepository){
        this.formRepository = formRepository;
    }
    
    public Form create(Form form) {return formRepository.save(form);}
    
    public List<Form> findAll() { return formRepository.findAll(); }
    
    public Optional<Form> update(Long id, Form formDetails) { 
        return formRepository.findById(id).map(form -> {
            form.setName(formDetails.getName());
            form.setProvider(formDetails.getProvider());
            form.setDescription(formDetails.getDescription());
            return formRepository.save(form);
        }); 
    }
    
    public Form findById(Long id) { return formRepository.findById(id).orElseThrow(); }
    
    public void delete(Long id) { formRepository.deleteById(id); }
}
