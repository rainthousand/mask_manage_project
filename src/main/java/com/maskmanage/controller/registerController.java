package com.maskmanage.controller;

import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.*;
import com.maskmanage.service.registerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping("/")
public class registerController {


    @Resource(name = "registerServiceImpl")
    private registerService registerService;

    @PostMapping("register")
    public  Object registerU(HttpServletRequest httpServletRequest, @RequestBody String requestbody){

        JSONObject object = JSONObject.parseObject(requestbody);
        String userName=object.get("username").toString();
        int id = Integer.parseInt(object.get("userid").toString());
        String userpassword = object.get("userpassword").toString();
        String useremail = object.get("useremail").toString();

        String userrole = object.get("userrole").toString();
        //将获取的JSON数据输出查看
        System.out.println(requestbody);
        System.out.println(id);
        System.out.println(userName);
        System.out.println(userpassword);
        System.out.println(useremail);
        System.out.println(userrole);
        maskuser maskuser1 = new maskuser();
        maskuser1.setUseremail(useremail);
        maskuser1.setUserpassword(userpassword);
        maskuser1.setUserrole(userrole);
        maskuser1.setUserid(id);
        maskuser1.setUsername(userName);
        int temp = registerService.registerU(maskuser1);
        if(temp != 0){
            System.out.println("注册成功！");
            //注册用户为捐赠者
            if(userrole.equals("donator")){
                donator donator1 = new donator();
                donator1.setDonatorid(id);
                donator1.setDonatoruserid(id);
                int tempd = registerService.registerDonator(donator1);
                if(tempd !=0){
                    System.out.println("捐赠者添加成功");
                    return "Donator added successfully!";
                }
                else{
                    return "Failed to add donator!";
                }
            }
            //注册用户为医院
            else if(userrole.equals("hospital")){
                hospital hospital1 = new hospital();
                hospital1.setHosid(id);
                hospital1.setHosuserid(id);
                int tempd = registerService.registerHospital(hospital1);
                if(tempd != 0){
                    System.out.println("医院添加成功");
                    return "Hospital added successfully";
                }
                else{
                    return "Failed to add hospital";
                }

            }
            else if(userrole.equals("admin")){
                maskadmin maskadmin1 = new maskadmin();
                maskadmin1.setAdminid(id);
                maskadmin1.setAdminuserid(id);
                int tempd = registerService.registerMaskadmin(maskadmin1);
                if(tempd != 0){
                    System.out.println("管理员添加成功");
                    return "Admin added successfully";
                }
                else{
                    return "Failed to add hospital";
                }

            }
            else {
                supervisor supervisor1 = new supervisor();
                supervisor1.setSupid(id);
                supervisor1.setSupuserid(id);
                int tempd = registerService.registerSupervisor(supervisor1);
                if(tempd !=0){
                    System.out.println("监管人员添加成功");
                    return "Supervisor added successfully";
                }
                else{
                    return "Failed to add supervisor";
                }
            }
        }
        else{
            System.out.println("注册失败");
            return "error";
        }


    }
}
