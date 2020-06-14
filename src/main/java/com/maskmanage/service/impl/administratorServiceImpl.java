package com.maskmanage.service.impl;
import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.*;
import com.maskmanage.service.administratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class administratorServiceImpl implements administratorService {

    @Autowired
    private com.maskmanage.mapper.requirementMapper requirementMapper;
    @Override
    public List<requirement> getRequirement() {
        requirementExample example=new requirementExample();
        requirementExample.Criteria criteria=example.createCriteria();
        return requirementMapper.selectByExample(example);
    }

    @Override
    public int deleteRequirementByID(int reqrId) {
        return requirementMapper.deleteByPrimaryKey(reqrId);
    }

    @Override
    public int changeRequirement(JSONObject jsonObject) {
        requirement reqr = new requirement();
        requirementExample reqrExemple = new requirementExample();
        requirementExample.Criteria criteria = reqrExemple.createCriteria().andReqridEqualTo(Integer.parseInt(jsonObject.getString("reqrId")));
        reqr.setReqstatus(jsonObject.getString("reqStatus"));
        reqr.setReqrname(jsonObject.getString("reqrName"));
        return requirementMapper.updateByExampleSelective(reqr,reqrExemple);
    }

    @Override
    public int newRequirement(JSONObject jsonObject) throws ParseException {
        requirement requirement_0 = new requirement();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        requirement_0.setReqrid(Integer.parseInt(jsonObject.getString("reqrId")));
        requirement_0.setReqrname(jsonObject.getString("reqrName"));
        requirement_0.setReqtype(Integer.parseInt(jsonObject.getString("reqrType")));
        requirement_0.setReqrtime(sdf.parse(jsonObject.getString("reqrTime")));
        requirement_0.setReqrstatus(Integer.parseInt(jsonObject.getString("reqrStatus")));
        requirement_0.setReqrhosid(Integer.parseInt(jsonObject.getString("reqrHosId")));
        requirement_0.setReqstatus((jsonObject.getString("reqStatus")));

        return requirementMapper.insert(requirement_0);
    }

    @Autowired
    private com.maskmanage.mapper.donatorMapper donatorMapper;
    @Override
    public List<donator> getAllDonator() {
        donatorExample example=new donatorExample();
        donatorExample.Criteria criteria=example.createCriteria();
        return donatorMapper.selectByExample(example);
    }

    @Override
    public int deleteDonatorByID(int donatorId) {
        return donatorMapper.deleteByPrimaryKey(donatorId);
    }

    @Override
    public int changeDonator(JSONObject jsonObject) {

        donator don=new donator();
        donatorExample example=new donatorExample();
        donatorExample.Criteria criteria=example.createCriteria().andDonatoridEqualTo(Integer.parseInt(jsonObject.getString("donatorId")));
        don.setDonatortel(jsonObject.getString("donatorTel"));
        don.setDonatorname(jsonObject.getString("donatorName"));
        return donatorMapper.updateByExampleSelective(don,example);
    }

    @Override
    public int newDonator(JSONObject jsonObject) throws ParseException {

        donator don=new donator();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        don.setDonatorid(Integer.parseInt(jsonObject.getString("donatorId")));
        don.setDonatortel(jsonObject.getString("donatorTel"));
        don.setDonatorname(jsonObject.getString("donatorName"));
        don.setDonatoridnum(jsonObject.getString("donatorIdNum"));
        don.setDonatorsigndate(sdf.parse(jsonObject.getString("donatorSignDate")));
        don.setDonatoruserid(Integer.parseInt(jsonObject.getString("donatorUserId")));

        return donatorMapper.insert(don);
    }

    @Autowired
    private com.maskmanage.mapper.expressMapper expressMapper;
    @Override
    public List<express> getAllExpress() {
        expressExample example = new expressExample();
        expressExample.Criteria criteria=example.createCriteria();
        return expressMapper.selectByExample(example);
    }

    @Override
    public int deleteExpressByID(int expressId) {
        return expressMapper.deleteByPrimaryKey(expressId);
    }

    @Override
    public int changeExpress(JSONObject jsonObject) {
        express exp = new express();
        expressExample example = new expressExample();
        expressExample.Criteria criteria=example.createCriteria().andExpressidEqualTo(Integer.parseInt(jsonObject.getString("expressId")));
        exp.setExpresstitle(jsonObject.getString("expressTitle"));
        exp.setAmount(Integer.parseInt(jsonObject.getString("expressAmount")));
        return expressMapper.updateByExampleSelective(exp , example);
    }

    @Override
    public int newExpress(JSONObject jsonObject) throws ParseException {
        express exp = new express();

        exp.setAmount(Integer.parseInt(jsonObject.getString("expressAmount")));
        exp.setExpresstitle(jsonObject.getString("expressTitle"));
        exp.setExpressapi(jsonObject.getString("expressApi"));
        exp.setType(Integer.parseInt(jsonObject.getString("expressType")));
        exp.setReqrid(Integer.parseInt(jsonObject.getString("reqrId")));
        exp.setExpressid(Integer.parseInt(jsonObject.getString("expressId")));

        return expressMapper.insert(exp);
    }

    @Autowired
    private com.maskmanage.mapper.donationMapper donationMapper;
    @Override
    public List<donation> getAllDonation() {
        donationExample example = new donationExample();
        donationExample.Criteria criteria=example.createCriteria();
        return donationMapper.selectByExample(example);
    }

    @Override
    public int deleteDonationByID(int donationId) {
        return donationMapper.deleteByPrimaryKey(donationId);
    }

    @Override
    public int changeDonation(JSONObject jsonObject) {
        donation donation_0 = new donation();
        donationExample example = new donationExample();
        donationExample.Criteria criteria=example.createCriteria().andDonationidEqualTo(Integer.parseInt(jsonObject.getString("donationId")));
        donation_0.setDonationamount(jsonObject.getString("donationAmount"));
        donation_0.setDonationname(jsonObject.getString("donationName"));
        return donationMapper.updateByExampleSelective(donation_0 , example);
    }

    @Override
    public int newDonation(JSONObject jsonObject) throws ParseException {
        donation don = new donation();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        don.setDonationid(Integer.parseInt(jsonObject.getString("donationId")));
        don.setDonationname(jsonObject.getString("donationName"));
        don.setResourceid(Integer.parseInt(jsonObject.getString("resourceId")));
        don.setDonationamount(jsonObject.getString("donationAmount"));
        don.setFromdonatorid(Integer.parseInt(jsonObject.getString("fromDonatorId")));
        don.setDonationtime(sdf.parse(jsonObject.getString("donationTime")));

        return donationMapper.insert(don);
    }

    @Autowired
    private com.maskmanage.mapper.newsMapper newsMapper;
    @Override
    public List<news> getAllNews() {
        newsExample example = new newsExample();
        newsExample.Criteria criteria=example.createCriteria();
        return newsMapper.selectByExample(example);
    }

    @Override
    public int changeNews(JSONObject jsonObject) throws ParseException {
        news news_0 = new news();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        newsExample example = new newsExample();
        newsExample.Criteria criteria=example.createCriteria().andNewsidEqualTo(Integer.parseInt(jsonObject.getString("newsId")));
        news_0.setNewstitle(jsonObject.getString("newsTitle"));
        news_0.setNewscontent(jsonObject.getString("newsContent"));
        news_0.setAuthorname(jsonObject.getString("authorName"));
        news_0.setNewspubtime(sdf.parse(jsonObject.getString("newsPubTime")));
        return newsMapper.updateByExampleSelective(news_0 , example);
    }
}
