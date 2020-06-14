package com.maskmanage.service;

import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.*;

import java.text.ParseException;
import java.util.List;

public interface donatorService {
    List<donation> getdonationBydonatorID(int fromdonatorid);
    int insertdonation(JSONObject jsonObject ) throws ParseException;
    int deleteBydonationId(int donationId);
    int updateDonatorInformation(JSONObject jsonObject );
    List<donator> getdonatorBydonatorID(int donatorId);
    List<express>  getExpress(int reqrId);
    List<requirement> getRequirement(int reqrId);
    List<hospital>  getHospital(int reqrHosId);
}

