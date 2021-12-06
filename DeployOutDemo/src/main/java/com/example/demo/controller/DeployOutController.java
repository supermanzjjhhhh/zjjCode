package com.example.demo.controller;


import com.example.demo.entity.DeployEntity;
import com.example.demo.service.NCDeployOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployOutController {
    @Autowired
    private NCDeployOutService ncDeployOutService;

    @RequestMapping("/deploy/add")
    public String deployAdd(@RequestBody DeployEntity deployEntity){
        //DeployEntity deployEntity = new DeployEntity();

        return ncDeployOutService.deployInsert(deployEntity);
    }
}
