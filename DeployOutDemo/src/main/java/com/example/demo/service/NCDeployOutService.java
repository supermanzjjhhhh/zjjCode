package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.DeployEntity;

import com.example.demo.util.XMLUtil;
import com.example.demo.wbservice.WorkOrderServiceItf;
import com.example.demo.wbservice.WorkOrderServiceItfPortType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class NCDeployOutService {

    public String deployInsert(DeployEntity deployEntity){
        String result = null;
        ArrayList<DeployEntity> deployList = new ArrayList<DeployEntity>();
        deployList.add(deployEntity);
        String s1 = XMLUtil.deployBeanToXML(deployList);
        WorkOrderServiceItf workOrderServiceItf = new WorkOrderServiceItf();
        WorkOrderServiceItfPortType workOrderServiceItfPortType =workOrderServiceItf.getWorkOrderServiceItfSOAP11PortHttp();
        result= workOrderServiceItfPortType.repairInsert(s1);
        JSONObject jasonObject = JSONObject.parseObject(result);
       Map<String,String> map = (Map)jasonObject;
        return result;
    }
}
