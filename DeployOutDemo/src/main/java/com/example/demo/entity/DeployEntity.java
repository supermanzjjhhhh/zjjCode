package com.example.demo.entity;

import lombok.Data;

@Data
public class DeployEntity {

    private int billStatus;
    private String memo;
    private String pkRecorder;
    private int workflowStatus;
    private String pkCorpOut;
    private String pkCorpIn;
    String billCode;
   // String billStatus;
    private String billType;
    private String busiType;
    //String checkDate;
   // String checkOpinion;
    String pkChecker;
    String pkMaker;
    //String transiType;
    //String updateDate;
    //String reason;
    //String pkAmorg;
    public DeployEntity() {
    }
}
