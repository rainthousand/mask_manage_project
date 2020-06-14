package com.maskmanage.service;

import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.*;

import java.text.ParseException;
import java.util.List;

public interface administratorService {
    List<requirement> getRequirement();
    int deleteRequirementByID(int reqrId);
    int changeRequirement(JSONObject jsonObject);
    int newRequirement(JSONObject jsonObject) throws ParseException;

    List<donator> getAllDonator();
    int deleteDonatorByID(int donatorId);
    int changeDonator(JSONObject jsonObject);
    int newDonator(JSONObject jsonObject) throws ParseException;

    List<express> getAllExpress();
    int deleteExpressByID(int expressId);
    int changeExpress(JSONObject jsonObject);
    int newExpress(JSONObject jsonObject) throws ParseException;

    List<donation> getAllDonation();
    int deleteDonationByID(int donationId);
    int changeDonation(JSONObject jsonObject);
    int newDonation(JSONObject jsonObject) throws ParseException;

    List<news> getAllNews();
    int changeNews(JSONObject jsonObject) throws ParseException;
}
