package com.maskmanage.controller;

import com.alibaba.fastjson.JSON;
import com.maskmanage.entity.*;
import com.maskmanage.service.loginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class LoginHandler {

    @Resource (name = "loginServImpl")
    private loginService loginService;
    @GetMapping("login/{id}/{name}/{password}")
    public Object login(@PathVariable("id") int id,
                        @PathVariable("password") String password,
                        @PathVariable("name") String name){


        System.out.println(" id:"+id+" name:" + name +" password:"+password);

        maskuserKey maskuserKey1 = new maskuserKey();
        maskuserKey1.setUserid(id);
        maskuserKey1.setUsername(name);
        maskuser maskuser1 = (maskuser)loginService.loginU(maskuserKey1);
        System.out.println(maskuser1);
        if(maskuser1 == null){
            return "User does not exist!";
        }
        //用户存在
        else{
            if(maskuser1.getUserpassword().equals(password)){
                System.out.println("账号密码正确！");

                //登录用户为捐赠者
                if(maskuser1.getUserrole().equals("donator")){
                    System.out.println("捐赠者登录");
                    donator donator1 = new donator();
                    donator1 = (donator) loginService.loginDonatorById(id);
                    if (donator1 == null){
                        System.out.println("There is no such donator!");
                        return "Donator does not exist!";
                     }
                    else{
                        System.out.println("密码正确，捐赠者登陆成功");
                        return JSON.toJSONString(donator1);
                    }

                }
                //登录用户为医院
                else if(maskuser1.getUserrole().equals("hospital")){
                    System.out.println("医院登录");
                    hospital hospital1 = new hospital();
                    hospital1 = (hospital)loginService.loginHospitalById(id);
                    if (hospital1 == null){
                        System.out.println("There is no such hospital!");
                        return "Hospital does not exist!";
                    }
                    else{
                        System.out.println("密码正确，捐赠者登陆成功");
                        return JSON.toJSONString(hospital1);
                    }

                }
                //登录用户为管理员
                else if(maskuser1.getUserrole().equals("admin")){
                    System.out.println("管理员登录");
                    maskadmin maskadmin1= new maskadmin();
                    maskadmin1 = (maskadmin)loginService.loginMaskadmin(id);
                    if (maskadmin1 == null){
                        System.out.println("There is no such admin!");
                        return "admin does not exist!";
                    }
                    else{
                        System.out.println("密码正确，管理员登陆成功");
                        return JSON.toJSONString(maskadmin1);
                    }

                }
                //登录用户为监管人员
                else{

                    System.out.println("监管人员登录");
                    supervisor supervisor1 = new supervisor();
                    supervisor1 = (supervisor)loginService.loginSupervisor(id);
                    if (supervisor1 == null){
                        System.out.println("There is no such supervisor!");
                        return "Supervisor does not exist!";
                    }
                    else{
                        System.out.println("密码正确，监管人员登陆成功");
                        return JSON.toJSONString(supervisor1);
                    }

                }

            }
            else{
                return "Password error";
            }
        }



    }

    @GetMapping("ll")
    public String log1(){
        return "ll";
    }

}
