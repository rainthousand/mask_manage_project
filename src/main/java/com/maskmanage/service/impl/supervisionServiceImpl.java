package com.maskmanage.service.impl;

import com.maskmanage.entity.*;
import com.maskmanage.mapper.*;
import com.maskmanage.service.supervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;

//捐赠表查询流程 don->donation->donator
//医院需求查询流程 hos->hospital->require
//医院使用查询流程 hos->hospital->require->usage
@Service
public class supervisionServiceImpl implements supervisorService {
    @Autowired
    donsupervisionMapper donsupervisionMapper;
    @Autowired
    hossupervisionMapper hossupervisionMapper;
    @Autowired
    hospitalMapper hospitalMapper;
    @Autowired
    requirementMapper requirementMapper;
    @Autowired
    maskusageMapper maskusageMapper;
    @Autowired
    donationMapper donationMapper;
    @Autowired
    donatorMapper donatorMapper;
    @Autowired
    resourceMapper resourceMapper;
    @Autowired
    maskdataMapper maskdataMapper;




    @Override
    public List<donsupervision> getDonSupervision(int status) {
        donsupervisionExample example = new donsupervisionExample();
        donsupervisionExample.Criteria criteria = example.createCriteria();
        criteria.andDonsupstatusEqualTo(status);
        return donsupervisionMapper.selectByExample(example);
    }

    @Override
    public List<hossupervision> getHosSupervision() {
        hossupervisionExample example = new hossupervisionExample();
        hossupervisionExample.Criteria criteria = example.createCriteria();
        return hossupervisionMapper.selectByExample(example);
    }

    @Override
    public List<donsupervision> getDonSupervisionById(int SupervisorId, int status) {
        donsupervisionExample example = new donsupervisionExample();
        donsupervisionExample.Criteria criteria = example.createCriteria();
        criteria.andDonsupstatusEqualTo(status);
        criteria.andSupervisionidEqualTo(SupervisorId);
        return donsupervisionMapper.selectByExample(example);
    }

    @Override
    public List<hossupervision> getHosSupervisionById(int SupervisorId) {
        hossupervisionExample example = new hossupervisionExample();
        hossupervisionExample.Criteria criteria = example.createCriteria();
        criteria.andSupervisionidEqualTo(SupervisorId);
        return hossupervisionMapper.selectByExample(example);
    }

    @Override
    public donation getDonationById(int donationId) {
        return donationMapper.selectByPrimaryKey(donationId);
    }

    @Override
    public donator getDonatorById(int donatorId) {
        return donatorMapper.selectByPrimaryKey(donatorId);
    }

    @Override
    public resource getResourceById(int resourceId) {
        return resourceMapper.selectByPrimaryKey(resourceId);
    }


    @Override
    public hospital getHospitalById(int hosId) {
        return hospitalMapper.selectByPrimaryKey(hosId);
    }

    @Override
    public List<requirement> getRequirementByStatus(int hosId, String status) {
        requirementExample example = new requirementExample();
        requirementExample.Criteria criteria = example.createCriteria();
        criteria.andReqrhosidEqualTo(hosId);
        criteria.andReqstatusEqualTo(status);
        return requirementMapper.selectByExample(example);
    }

    @Override
    public requirement getRequirementById(int requireId) {
        return requirementMapper.selectByPrimaryKey(requireId);
    }


    @Override
    public List<maskusage> getUsage(int hosId, int requireId,int status) {
        maskusageExample example = new maskusageExample();
        maskusageExample.Criteria criteria = example.createCriteria();
        criteria.andUsagehosidEqualTo(hosId);
        criteria.andReqridEqualTo(requireId);
        criteria.andUsagestatusEqualTo(status);
        return maskusageMapper.selectByExample(example);
    }

    @Override
    public maskusage getUsageById(int usageId) {
        return maskusageMapper.selectByPrimaryKey(usageId);
    }

    @Override
    public void updateDonSupervision(int SupervisorId, int donationId, int status) throws Exception {
        donsupervisionExample example = new donsupervisionExample();
        donsupervisionExample.Criteria criteria = example.createCriteria();
        criteria.andSupervisionidEqualTo(SupervisorId);
        criteria.andDonidEqualTo(donationId);
        donsupervision donsupervision = new donsupervision();
        donsupervision.setDonsupstatus(status);
        donsupervisionMapper.updateByExampleSelective(donsupervision,example);
    }

    @Override
    public void updateRequirement(int requireId, String status) throws Exception {
        requirementExample example = new requirementExample();
        requirementExample.Criteria criteria = example.createCriteria();
        criteria.andReqridEqualTo(requireId);
        requirement requirement = new requirement();
        requirement.setReqstatus(status);
        requirementMapper.updateByExampleSelective(requirement,example);
    }

    @Override
    public void updateUsage(int usageId, int status) throws Exception {
        maskusageExample example = new maskusageExample();
        maskusageExample.Criteria criteria = example.createCriteria();
        criteria.andUsageidEqualTo(usageId);
        maskusage usage = new maskusage();
        usage.setUsagestatus(status);
        maskusageMapper.updateByExampleSelective(usage,example);
    }

    @Override
    public List<JSONObject> getDonationList(int status) {
        List<donsupervision> donsupervisions = getDonSupervision(status);

        List<JSONObject> donationList = new ArrayList<JSONObject>();

        for(donsupervision d : donsupervisions){
            JSONObject object = new JSONObject();
            donation donation = getDonationById(d.getDonid());
            donator donator = getDonatorById(donation.getDonationid());
            object.put("donation",donation);
            object.put("donator",donator);
            donationList.add(object);
        }
        return donationList;
    }


    @Override
    public List<JSONObject> getDonationListById(int SupervisorId, int status) {
        List<donsupervision> donsupervisionList = getDonSupervisionById(SupervisorId,status);

        List<JSONObject> donationList = new ArrayList<JSONObject>();
        for(donsupervision d: donsupervisionList){
            JSONObject object = new JSONObject();
            donation donation = getDonationById(d.getDonid());
            donator donator = getDonatorById(donation.getDonationid());
            resource resource = getResourceById(donation.getResourceid());
            object.put("donation",donation);
            object.put("donator",donator);
            object.put("resource",resource);
            donationList.add(object);
        }
        return donationList;
    }

    @Override
    public JSONObject getDonationDetail(int donationId) {
        donation donation = getDonationById(donationId);
        JSONObject object = (JSONObject)JSONObject.toJSON(donation);
        return object;
    }

    @Override
    public List<JSONObject> getRequirementList(String status) {
        List<hossupervision> hossupervisionList = getHosSupervision();
        List<JSONObject> requirements = new ArrayList<JSONObject>();
        for(hossupervision h:hossupervisionList){

            hospital hospital = getHospitalById(h.getHosid());
            List<requirement> requirementList = getRequirementByStatus(hospital.getHosid(),status);
            for(requirement r:requirementList) {
                JSONObject object = new JSONObject();
                object.put("hospitalInfo",hospital);
                object.put("requirementInfo", r);
                requirements.add(object);
            }
        }
        return requirements;
    }

    @Override
    public List<JSONObject> getRequirementListById(int SupervisorId, String status) {
        List<hossupervision> hossupervisionList = getHosSupervisionById(SupervisorId);
        List<JSONObject> requirementList = new ArrayList<JSONObject>();
        for(hossupervision h:hossupervisionList){

            hospital hospital = getHospitalById(h.getHosid());
            List<requirement> requirements = getRequirementByStatus(hospital.getHosid(),status);
            for(requirement r:requirements) {
                JSONObject object = new JSONObject();
                object.put("hospitalInfo",hospital);
                object.put("requirementInfo", r);
                requirementList.add(object);
            }
        }
        return requirementList;
    }

    @Override
    public JSONObject getRequirementDetail(int requirementId) {
        requirement requirement = getRequirementById(requirementId);
        return (JSONObject) JSONObject.toJSON(requirement);
    }

    @Override
    public List<JSONObject> getUsageList(int status) {
        List<hossupervision> hossupervisionList = getHosSupervision();
        List<JSONObject> usageList = new ArrayList<>();

        for(hossupervision h:hossupervisionList){
            hospital hospital = getHospitalById(h.getHosid());
            //必须是通过的需求才有使用情况
            List<requirement> requirements = getRequirementByStatus(hospital.getHosid(),"1");
            for(requirement r: requirements){
                JSONObject object = new JSONObject();
                List<maskusage> usages = getUsage(hospital.getHosid(),r.getReqrhosid(),status);
                object.put("hospitalInfo",hospital);
                object.put("requireInfo",r);
                object.put("usage",usages);
                usageList.add(object);
            }
        }
        return usageList;
    }

    @Override
    public List<JSONObject> getUsageListById(int status,int SupervisorId) {
        List<hossupervision> hossupervisionList = getHosSupervisionById(SupervisorId);
        List<JSONObject> usageList = new ArrayList<>();

        for(hossupervision h: hossupervisionList){
            hospital hospital = getHospitalById(h.getHosid());
            //必须是通过的需求才有使用情况
            List<requirement> requirements = getRequirementByStatus(hospital.getHosid(),"1");

            for(requirement r:requirements){
                JSONObject object = new JSONObject();
                List<maskusage> usages = getUsage(hospital.getHosid(),r.getReqrhosid(),status);
                object.put("hospitalInfo",hospital);
                object.put("usage",usages);
                usageList.add(object);
            }
        }
        return usageList;
    }

    @Override
    public JSONObject getUsageDetail(int usageId) {
        return (JSONObject) JSONObject.toJSON(getUsageById(usageId));
    }

    @Override
    public List<maskdata> getDataList() {
        maskdataExample example = new maskdataExample();
        maskdataExample.Criteria criteria = example.createCriteria();
        return maskdataMapper.selectByExample(example);
    }

    @Override
    public maskdata getDetailData(int dataId) {
        return maskdataMapper.selectByPrimaryKey(dataId);
    }
}
