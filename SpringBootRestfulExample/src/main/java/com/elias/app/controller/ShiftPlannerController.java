/**
 * 
 */
package com.elias.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elias.app.model.Resources;
import com.elias.app.model.ShiftPlanner;
import com.elias.app.model.Shifts;
import com.elias.app.repo.GetShiftPlanRepo;
import com.elias.app.repo.ResourceRepo;
import com.elias.app.repo.ShiftPlannerRepo;
import com.elias.app.repo.ShiftRepo;
import com.elias.app.view.ShiftPlannerView;

/**
 * @author ADMIN
 *
 */
@RestController
@RequestMapping("/shiftPlanner")
public class ShiftPlannerController {
	@Autowired
	ShiftPlannerRepo shiftPlannerRepo;
	
	@Autowired
	ResourceRepo resourceRepo;
	
	@Autowired
	ShiftRepo shiftRepo;
	
	@Autowired
	GetShiftPlanRepo getShiftPlanRepo;
	
	@GetMapping("/getAllShiftPlan")
	public List<ShiftPlanner> getAllNotes() {
	    return shiftPlannerRepo.findAll();
	}
	
	@RequestMapping(value="/getThisWeekPlan", method = RequestMethod.GET)
	public ResponseEntity<List<ShiftPlannerView>> getThisWeekPlan() { 
	List<ShiftPlannerView> shiftPlanList=getShiftPlanRepo.fetchThisWeekShiftPlan();
	if (shiftPlanList.isEmpty()) {
        return new ResponseEntity<List<ShiftPlannerView>>(HttpStatus.NO_CONTENT);
    }
	    return new ResponseEntity<List<ShiftPlannerView>>(shiftPlanList, HttpStatus.OK);
	}

	@PostMapping("/addShiftPlanner")
	public ShiftPlanner createShiftPlanner(@Valid @RequestBody ShiftPlanner shiftPlanner) {
		Long resourceId=shiftPlanner.getResourceEntity().getResourceId();
		Long shiftId=shiftPlanner.getShiftEntity().getShiftId();
		
		Resources resources=resourceRepo.findOne(resourceId);
		shiftPlanner.setResourceEntity(resources);
		
		Shifts shifts=shiftRepo.getOne(shiftId);
		shiftPlanner.setShiftEntity(shifts);
		
	    return shiftPlannerRepo.save(shiftPlanner);
	}

}
