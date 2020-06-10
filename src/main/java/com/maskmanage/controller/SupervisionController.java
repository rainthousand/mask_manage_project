package com.maskmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.maskdata;
import com.maskmanage.service.supervisorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Supervisor")
public class SupervisionController {
    @Resource(name = "supervisionServiceImpl")
    private supervisorService supervisorService;

    //读取全部的已审批的捐赠信息列表
    @GetMapping(value = "getDonationList")
    List<JSONObject> getDonationList(){
        return supervisorService.getDonationList(1);
    }

    //对于当前审批人员,获取待指定状态的列表
    @GetMapping(value = "getDonationListById")
    List<JSONObject> getDonationListById(@RequestParam int SupervisorId, @RequestParam int status){
        return supervisorService.getDonationListById(SupervisorId,status);
    }

    //读取全部已审批的需求信息
    @GetMapping(value = "getRequirementList")
    List<JSONObject> getRequirementList(){
        return supervisorService.getRequirementList("1");
    }

    //对于当前人员，获取指定状态的需求列表
    @GetMapping(value = "getRequirementListById")
    List<JSONObject> getRequirementListById(@RequestParam int SupervisorId, @RequestParam String status){
        return supervisorService.getRequirementListById(SupervisorId, status);
    }

    //读取全部已审批的使用情况信息
    @GetMapping(value = "getUsageList")
    List<JSONObject> getUsageList(){
        return supervisorService.getUsageList(1);
    }

    //对于当前人员，读取指定状态的使用情况信息
    @GetMapping(value = "getUsageListById")
    List<JSONObject> getUsageListById(@RequestParam int SupervisorId, @RequestParam int status){
        return supervisorService.getUsageListById(status,SupervisorId);
    }

    //获取捐赠的具体信息
    @GetMapping(value = "getDonationDetail")
    JSONObject getDonationDetail(@RequestParam int DonationId){
        return supervisorService.getDonationDetail(DonationId);
    }

    //获取需求的具体信息
    @GetMapping(value = "getRequirementDetail")
    JSONObject getRequirementDetail(@RequestParam int RequirementId){
        return supervisorService.getRequirementDetail(RequirementId);
    }

    //获取使用情况的具体信息
    @GetMapping(value = "getUsageDetail")
    JSONObject getUsageDetail(@RequestParam int UsageId){
        return supervisorService.getUsageDetail(UsageId);
    }

    //审批捐赠信息
    @PostMapping(value = "updateDonation")
    JSONObject updateDonation(@RequestParam int SupervisorId, @RequestParam int DonationId, @RequestParam int status){
        JSONObject object = new JSONObject();
        try{
            supervisorService.updateDonSupervision(SupervisorId, DonationId, status);
            object.put("Info","Success");
        }catch (Exception e){
            object.put("Info","Fail");
        }
        return object;
    }


    //更新物资需求信息
    @PostMapping(value = "/updateRequirement")
    JSONObject updateRequirement(@RequestParam int RequirementId, @RequestParam String status){
        JSONObject object = new JSONObject();
        try{
            supervisorService.updateRequirement(RequirementId, status);
            object.put("Info","Success");
        }catch (Exception e){
            object.put("Info","Fail");
        }
        return object;
    }


    //更新使用情况信息
    @PostMapping(value = "/updateUsage")
    JSONObject updateUsage( @RequestParam int UsageId, @RequestParam int status){
        JSONObject object = new JSONObject();
        try{
            supervisorService.updateUsage(UsageId, status);
            object.put("Info","Success");
        }catch (Exception e){
            object.put("Info","Fail");
        }
        return object;
    }


    @GetMapping(value = "/getDataList")
    List<maskdata> getDataList(){
        return supervisorService.getDataList();
    }

    @GetMapping(value = "/getDataListById")
    List<maskdata> getDataListById(@RequestParam int SupervisorId){
        return supervisorService.getDataList();
    }

    @GetMapping(value = "/getDataDetail")
    maskdata getDataDetail(@RequestParam int dataId){
        return supervisorService.getDetailData(dataId);
    }

    @PostMapping(value = "/updateData")
    JSONObject updateData(@RequestParam int dataId, int status){
        JSONObject object = new JSONObject();
        object.put("Info","Success");
        return object;
    }
}
