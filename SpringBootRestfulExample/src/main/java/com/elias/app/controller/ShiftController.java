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
import com.elias.app.model.Shifts;
import com.elias.app.repo.ResourceRepo;
import com.elias.app.repo.ShiftRepo;

/**
 * @author ADMIN
 *
 */
@RestController
@RequestMapping("/shifts")
public class ShiftController {
	
	@Autowired
	ShiftRepo shiftRepo;
	
	@GetMapping("/getAllShifts")
	public List<Shifts> getAllShifts() {
	    return shiftRepo.findAll();
	}

	@PostMapping("/addShift")
	public Shifts createShift(@Valid @RequestBody Shifts shiftEntity) {
	    return shiftRepo.save(shiftEntity);
	}

}
