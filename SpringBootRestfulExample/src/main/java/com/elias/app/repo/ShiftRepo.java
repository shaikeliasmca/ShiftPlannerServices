/**
 * 
 */
package com.elias.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elias.app.model.Shifts;

/**
 * @author ADMIN
 *
 */
public interface ShiftRepo extends JpaRepository<Shifts,Long>{

}
