package com.example.userDetails_backend.controller;

import com.example.userDetails_backend.model.Plan;
import com.example.userDetails_backend.repository.PlanRepository;
import com.example.userDetails_backend.service.PlanServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/plan")
public class PlanController {

    @Autowired
    private PlanServiceImplementation planServiceImplementation;

    @PostMapping("/addPlan")
    public Plan addPlan(@RequestBody Plan plan){
        return planServiceImplementation.addPlan(plan);
    }
}
