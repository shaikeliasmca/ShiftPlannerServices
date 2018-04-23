package com.elias.app.repo;

import java.util.List;

import com.elias.app.view.ShiftPlannerView;

public interface GetShiftPlanRepo {

	List<ShiftPlannerView> fetchThisWeekShiftPlan();
}
