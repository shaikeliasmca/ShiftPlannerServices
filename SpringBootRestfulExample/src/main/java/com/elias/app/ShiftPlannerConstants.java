/**
 * 
 */
package com.elias.app;

/**
 * @author ADMIN
 *
 */
public class ShiftPlannerConstants {
	
	public static final String TODAYSSHIFTPLANQUERY="SELECT * FROM ShiftPlanner WHERE shiftPlannerDate > DATE_SUB(NOW(), INTERVAL 1 DAY) ORDER BY shiftPlannerDate";        
	public static final String THISWEEKSHIFTPLANQUERY="SELECT sp.shift_planner_date,r.resource_name,s.shift_name FROM eliasDB.shift_planner sp inner join eliasDB.resources r on r.resource_id=sp.resource_id\r\n" + 
			"inner join eliasDB.shifts s on s.shift_id= sp.shift_id\r\n" + 
			" WHERE shift_planner_date > DATE_SUB(NOW(), INTERVAL 1 WEEK) \r\n" + 
			"ORDER BY shift_planner_date";
	public static final String THISMONTHSSHIFTPLANQUERY="SELECT * FROM ShiftPlanner WHERE shiftPlannerDate > DATE_SUB(NOW(), INTERVAL 1 MONTH) ORDER BY shiftPlannerDate";

}
