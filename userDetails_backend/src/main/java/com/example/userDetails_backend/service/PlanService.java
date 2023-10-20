package com.example.userDetails_backend.service;

import com.example.userDetails_backend.model.Plan;

import java.util.List;

public interface PlanService {
    Plan addPlan(Plan plan);

    Plan getPlanById(long planId);


}
