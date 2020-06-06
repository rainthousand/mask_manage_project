package com.maskmanage.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.*;
import com.maskmanage.mapper.*;
import com.maskmanage.service.donatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.hateoas.Links;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class donatorServiceImpl implements donatorService {
    @Autowired
    private donationMapper donationMapper;


    @Override
    public List<donation> getdonationBydonatorID(int fromdonatorid) {
        donationExample example=new donationExample();
        donationExample.Criteria criteria=example.createCriteria().andFromdonatoridEqualTo(fromdonatorid);
        return donationMapper.selectByExample(example);
    }

    @Override
    public int insertdonation(JSONObject jsonObject )  throws ParseException {
        donation don = new  donation ();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        don.setDonationid(Integer.parseInt(jsonObject.getString("donationId")));
        don.setDonationname(jsonObject.getString("donationName"));
        don.setResourceid(Integer.parseInt(jsonObject.getString("resourceId")));
        don.setDonationamount(jsonObject.getString("donationAmount"));
        don.setFromdonatorid(Integer.parseInt(jsonObject.getString("fromDonatorId")));
        don.setDonationtime(sdf.parse(jsonObject.getString("donationTime")));
        return donationMapper.insert(don);
    }

    @Override
    public int deleteBydonationId(int donationId) {
        return donationMapper.deleteByPrimaryKey(donationId);
    }
    @Autowired
    private donatorMapper donatorMapper;
    @Override
    public int updateDonatorInformation(JSONObject jsonObject ) {
        donator don=new donator();
        donatorExample example=new donatorExample();
        donatorExample.Criteria criteria=example.createCriteria().andDonatoridEqualTo(Integer.parseInt(jsonObject.getString("donatorId")));
        don.setDonatortel(jsonObject.getString("donatorTel"));
        don.setDonatorname(jsonObject.getString("donatorName"));
        return donatorMapper.updateByExampleSelective(don,example);
    }

    @Override
    public List<donator> getdonatorBydonatorID(int donatorId) {
        donatorExample example=new donatorExample();
        donatorExample.Criteria criteria=example.createCriteria().andDonatoridEqualTo(donatorId);
        return donatorMapper.selectByExample(example);
    }
    @Autowired
    private expressMapper expressMapper;
    @Override
    public List<express> getExpress(int reqrId) {
        expressExample example=new expressExample();
        expressExample.Criteria criteria=example.createCriteria().andReqridEqualTo(reqrId);
        return expressMapper.selectByExample(example);
    }
    @Autowired
    private requirementMapper requirementMapper;
    @Override
    public List<requirement> getRequirement(int reqrId) {
        requirementExample example=new requirementExample();
        requirementExample.Criteria criteria=example.createCriteria().andReqridEqualTo(reqrId);
        return requirementMapper.selectByExample(example);
    }
    @Autowired
    private hospitalMapper  hospitalMapper ;
    @Override
    public List<hospital> getHospital(int hId) {
        hospitalExample example=new hospitalExample();
        hospitalExample.Criteria criteria=example.createCriteria().andHosidEqualTo(hId);
        return  hospitalMapper .selectByExample(example);
    }


}
