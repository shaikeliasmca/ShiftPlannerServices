/**
 * 
 */
package com.elias.app.repo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.elias.app.ShiftPlannerConstants;
import com.elias.app.view.ShiftPlannerView;

/**
 * @author ADMIN
 *
 */

@Repository
public class GetShiftPlanRepoImpl implements GetShiftPlanRepo{

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@PersistenceContext
	EntityManager em;

	@Override
	public List<ShiftPlannerView> fetchThisWeekShiftPlan() {

		List<ShiftPlannerView> listOfShiftPlannerView=new ArrayList<>();
		try {
			
			Query q= em.createNativeQuery(ShiftPlannerConstants.THISWEEKSHIFTPLANQUERY);
			List<Object[]> result=q.getResultList();
			for(Object[] row : result){
				ShiftPlannerView emp = new ShiftPlannerView();

				Date workingDays = sdf.parse(row[0].toString());
				emp.setShiftPlannerDate(workingDays);
				emp.setResourceName(row[1].toString());
				emp.setShiftName(row[2].toString());
				listOfShiftPlannerView.add(emp);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return listOfShiftPlannerView;
	}

}
