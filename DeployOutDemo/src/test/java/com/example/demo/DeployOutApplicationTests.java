package com.example.demo;

import com.example.demo.entity.DeployEntity;
import com.example.demo.service.NCDeployOutService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DeployOutApplicationTests {
    @Autowired
    private NCDeployOutService ncDeployOutService;
    @Test
    public void test(){
        DeployEntity deployEntity = new DeployEntity();
        deployEntity.setMemo("1111111");
        deployEntity.setBillStatus(0);
        deployEntity.setPkCorpIn("1002");
        deployEntity.setPkCorpOut("1003");
        deployEntity.setPkRecorder("1003H7100000000004SG");
        deployEntity.setWorkflowStatus(0);
        deployEntity.setBillCode("SYDC2107160111");
        deployEntity.setBillType("4A33");
        deployEntity.setBusiType("0001D11000000000PFXM");
        deployEntity.setPkChecker("0001H810000000008ZEC");
        deployEntity.setPkMaker("0001H810000000008ZEC");
        System.out.println(ncDeployOutService.deployInsert(deployEntity));
    }

}
