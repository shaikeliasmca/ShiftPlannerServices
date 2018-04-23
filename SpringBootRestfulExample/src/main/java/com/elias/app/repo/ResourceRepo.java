/**
 * 
 */
package com.elias.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elias.app.model.Resources;

/**
 * @author ADMIN
 *
 */
public interface ResourceRepo extends JpaRepository<Resources, Long> {

}
