/**
 * 
 */
package com.elias.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elias.app.model.Resources;
import com.elias.app.repo.ResourceRepo;

/**
 * @author ADMIN
 *
 */
@RestController
@RequestMapping("/resources")
public class ResourceController {
	
	@Autowired
	ResourceRepo resourceRepo;
	
	@GetMapping("/getAllResources")
	public List<Resources> getAllResources() {
	    return resourceRepo.findAll();
	}

	@PostMapping("/addResource")
	public Resources createResources(@Valid @RequestBody Resources resourceEntity) {
	    return resourceRepo.save(resourceEntity);
	}
}
