
package com.inventary.form.repository;

import com.inventary.form.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jesus_Linares
 */
public interface FormRepository extends JpaRepository<Form, Long> {
    
}
