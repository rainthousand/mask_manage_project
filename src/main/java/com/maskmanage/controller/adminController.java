package com.maskmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maskmanage.service.administratorService;
import javax.annotation.Resource;
import javax.json.Json;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class adminController {
    @Resource(name = "administratorServiceImpl")
    private com.maskmanage.service.administratorService administratorService;
    @RequestMapping(value = "/admin/showAllReqr", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getAllReqr(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<requirement> list = administratorService.getRequirement();
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/delReqr", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String delReqr(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.deleteRequirementByID(Integer.parseInt(jsonObject.getString("reqrId")));
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/addReqr", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String addReqr(HttpServletRequest request , @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.newRequirement(jsonObject);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/updateReqr", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String updateReqr(HttpServletRequest request , @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.changeRequirement(jsonObject);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    //*********************************************************************************//
    //********************对donator操作************************************************//
    @RequestMapping(value = "/admin/showAllDonator", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getAlldonator(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<donator> list = administratorService.getAllDonator();
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/delDonator", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String delDonator(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.deleteDonatorByID(Integer.parseInt(jsonObject.getString("donatorId")));
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/addDonator", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String addDonator(HttpServletRequest request , @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.newDonator(jsonObject);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/updateDonator", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String updateDonator(HttpServletRequest request , @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.changeDonator(jsonObject);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    //*********************************************************************************//
    //********************对express操作************************************************//
    @RequestMapping(value = "/admin/showAllExpress", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getAllExpress(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<express> list = administratorService.getAllExpress();
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/delExpress", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String delExpress(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.deleteExpressByID(Integer.parseInt(jsonObject.getString("expressId")));
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/addExpress", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String addExpress(HttpServletRequest request , @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.newExpress(jsonObject);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/updateExpress", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String updateExpress(HttpServletRequest request , @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.changeExpress(jsonObject);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }


    //*********************************************************************************//
    //********************对donation操作************************************************//
    @RequestMapping(value = "/admin/showAllDonation", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getAllDonation(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<donation> list = administratorService.getAllDonation();
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/delDonation", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String delDonation(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.deleteDonationByID(Integer.parseInt(jsonObject.getString("donationId")));
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/addDonation", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String addDonation(HttpServletRequest request , @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.newDonation(jsonObject);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/updateDonation", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String updateDonation(HttpServletRequest request , @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.changeDonation(jsonObject);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }


    //*********************************************************************************//
    //********************对donation操作************************************************//
    @RequestMapping(value = "/admin/showAllNews", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String getAllNews(HttpServletRequest request , @RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<news> list = administratorService.getAllNews();
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    @RequestMapping(value = "admin/updateNews", produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    public String updateNews(HttpServletRequest request , @RequestBody String json) throws ParseException {
        JSONObject jsonObject = JSONObject.parseObject(json);
        int flag = administratorService.changeNews(jsonObject);
        List<String> list = new ArrayList<>();
        if(flag == 0 ){
            list.add("false");
        }else{
            list.add("success")        ;
        }
        return jsonObject.toJSONString(addUrl(request,jsonObject,list));
    }

    public JSONObject addUrl(HttpServletRequest request, JSONObject jsonObject, List list){
        JSONObject req=new JSONObject();
        req.put("link",request.getRequestURL().toString());
        req.put("body",jsonObject);

        JSONObject listall=new JSONObject();
        listall.put("request",req);
        listall.put("data",list);
        return listall;
    }
}
