package com.maskmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.*;
import com.maskmanage.service.donatorService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class donatorController {
    @Resource(name = "donatorServiceImpl")
    private donatorService donatorService;

    @RequestMapping(value = "/donator/search", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getdonationBydonatorID(HttpServletRequest request, @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<donation> list= donatorService.getdonationBydonatorID(Integer.parseInt(jsonObject.getString("id")));
        return JSONObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "/donator/new", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String addNewDonation(HttpServletRequest request, @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag=donatorService.insertdonation(jsonObject);
        List<String> list=new ArrayList<>();
        System.out.println(flag);
        if(flag==0){
            list.add("false");
        }
        else{
            list.add("success");
        }
        return JSONObject.toJSONString(addUrl(request,jsonObject,list));
    }
    @RequestMapping(value = "/donator/delete", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String deleteDonation(HttpServletRequest request, @RequestBody String json)  {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag=donatorService.deleteBydonationId(Integer.parseInt(jsonObject.getString("donationId")));
        List<String> list=new ArrayList<>();
        System.out.println(flag);
        if(flag==0){
            list.add("false");
        }
        else{
            list.add("success");
        }
        return JSONObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "/donator/modify", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String modifyDonation(HttpServletRequest request, @RequestBody String json)  {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag=donatorService.updateDonatorInformation(jsonObject);
        List<String> list=new ArrayList<>();
        System.out.println(flag);
        if(flag==0){
            list.add("false");
        }
        else{
            list.add("success");
        }
        return JSONObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "/donator/information", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getdonatorBydonatorID(HttpServletRequest request, @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<donator> list= donatorService.getdonatorBydonatorID(Integer.parseInt(jsonObject.getString("donatorId")));
        return JSONObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "/donator/express", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getdonationExpress(HttpServletRequest request, @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<donation> list= donatorService.getdonationBydonatorID(Integer.parseInt(jsonObject.getString("donatorid")));
        List<List<express>> list1=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list1.add(donatorService.getExpress(list.get(i).getDonationid()));
        }
        return JSONObject.toJSONString(addUrl(request,jsonObject,list1));
    }
    @RequestMapping(value = "/donator/used", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getRequiremnet(HttpServletRequest request, @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<donation> list= donatorService.getdonationBydonatorID(Integer.parseInt(jsonObject.getString("donatorid")));
        List<List<requirement>> list1=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list1.add(donatorService.getRequirement(list.get(i).getDonationid()));
        }
        return JSONObject.toJSONString(addUrl(request,jsonObject,list1));
    }
    @RequestMapping(value = "/donator/hospital", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String gethos(HttpServletRequest request, @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<hospital> list= donatorService.getHospital(Integer.parseInt(jsonObject.getString("reqrHosId")));
        return JSONObject.toJSONString(addUrl(request,jsonObject,list));
    }
    public JSONObject addUrl(HttpServletRequest request,JSONObject jsonObject,List list){
        JSONObject req=new JSONObject();
        req.put("link",request.getRequestURL().toString());
        req.put("body",jsonObject);

        JSONObject listall=new JSONObject();
        listall.put("request",req);
        listall.put("data",list);
        return listall;
    }


}
