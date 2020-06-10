package com.maskmanage.service;

import com.maskmanage.entity.*;
import com.alibaba.fastjson.JSONObject;

import javax.xml.crypto.Data;
import java.util.List;

public interface supervisorService {
    //捐赠表查询流程 don->donation->donator
    //医院需求查询流程 hos->hospital->require
    //医院使用查询流程 hos->hospital->require->usage

    List<donsupervision> getDonSupervision(int status);
    List<hossupervision> getHosSupervision();

    List<donsupervision> getDonSupervisionById(int SupervisorId, int status);
    List<hossupervision> getHosSupervisionById(int SupervisorId);

    donation getDonationById(int donationId);
    donator getDonatorById(int donatorId);
    resource getResourceById(int resourceId);
    hospital getHospitalById(int hosId);

    List<requirement> getRequirementByStatus(int hosId, String status);
    requirement getRequirementById(int requireId);
    List<maskusage> getUsage(int hosId, int requireId,int status);
    maskusage getUsageById(int usageId);

    void updateDonSupervision(int SupervisorId,int donationId,int status)throws Exception;
    void updateRequirement(int requireId,String status)throws Exception;
    void updateUsage(int usageId, int status)throws Exception;

    List<JSONObject> getDonationList(int status);
    List<JSONObject> getDonationListById(int SupervisorId,int status);
    JSONObject getDonationDetail(int donationId);

    List<JSONObject> getRequirementList(String status);
    List<JSONObject> getRequirementListById(int SupervisorId, String status);
    JSONObject getRequirementDetail(int requirementId);

    List<JSONObject> getUsageList(int status);
    List<JSONObject> getUsageListById(int status, int SupervisorId);
    JSONObject getUsageDetail(int usageId);

    List<maskdata> getDataList();
    maskdata getDetailData(int dataId);

}
