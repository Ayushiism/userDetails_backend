package com.example.userDetails_backend.service;

import com.example.userDetails_backend.exception.ResourceNotFoundException;
import com.example.userDetails_backend.model.Plan;
import com.example.userDetails_backend.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImplementation implements PlanService{

    @Autowired
    private PlanRepository planRepository;


    @Override
    public Plan addPlan(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public Plan getPlanById(long planId) {
        return planRepository.findById(planId).orElseThrow(() ->
                new ResourceNotFoundException("plan not Exit with id "+planId));
    }
}
