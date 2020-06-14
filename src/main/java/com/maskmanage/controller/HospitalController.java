package com.maskmanage.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.express;
import com.maskmanage.entity.maskstorage;
import com.maskmanage.entity.maskusage;
import com.maskmanage.entity.requirement;
import com.maskmanage.service.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Resource(name = "hospitalServiceImpl")
    private hospitalService hosService;


    // Requirements相关
    @Operation(summary = "Find all requirements", description = "", tags = { "requirement" })
    @GetMapping(value="/requirements")
	public String getAllRequirements(){
		List<requirement> requirements = hosService.findAllRequirement();

		return JSON.toJSONString(requirements);
	}

    @Operation(summary = "Add a new requirement", description = "", tags = { "requirement" })
    @RequestMapping(value = "/newrequirement", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody String addNewRequirement(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);
        JSONObject object = JSONObject.parseObject(requestbody);
        requirement reqr = object.toJavaObject(requirement.class);

        hosService.saveRequirement(reqr);

        return "success";
    }

    @Operation(summary = "Get the requirement by hospital id", description = "", tags = { "requirement" })
    @RequestMapping(value = "/requirement/{hosId}", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody String getRequirementByHosId(HttpServletRequest request, @PathVariable int hosId) {
        System.out.println("test");
        System.out.println(hosId);
        List<requirement> list = hosService.findReqByHosId(hosId);

        return JSON.toJSONString(list);
    }

    // Express 相关
    @Operation(summary = "Find all express", description = "", tags = { "express" })
    @GetMapping(value="/express")
    public String getAllExpress(){
        List<express> list = hosService.findAllExpress();

        return JSON.toJSONString(list);
    }

    @Operation(summary = "Get the express by requirement id", description = "", tags = { "express" })
    @RequestMapping(value = "/express/{reqrId}", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody String getExpressByReqrId(HttpServletRequest request, @PathVariable int reqrId) {
        System.out.println("test");
        System.out.println(reqrId);
        express expr = hosService.findExpressByReqId(reqrId);

        return JSON.toJSONString(expr);
    }

    //Usage 相关
    @Operation(summary = "Find all usages", description = "", tags = { "usage" })
    @GetMapping(value="/usages")
    public String getAllUsages(){
        List<maskusage> list = hosService.findAllUsage();

        return JSON.toJSONString(list);
    }

    @Operation(summary = "Add a new usage information", description = "", tags = { "usage" })
    @RequestMapping(value = "/newusage", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody String addNewUsage(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);
        JSONObject object = JSONObject.parseObject(requestbody);
        maskusage usage = object.toJavaObject(maskusage.class);

        hosService.saveUsage(usage);

        return "success";
    }

    @Operation(summary = "Get the usage information by requirement id", description = "", tags = { "usage" })
    @RequestMapping(value = "/usage/{reqrId}", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody String getUsageByReqrId(HttpServletRequest request, @PathVariable int reqrId) {
        System.out.println("test");
        System.out.println(reqrId);
        List<maskusage> usage = hosService.findUsageByReqId(reqrId);

        return JSON.toJSONString(usage);
    }

    //Storage存储量相关
    @Operation(summary = "Find all storage information", description = "", tags = { "storage" })
    @GetMapping(value="/storages")
    public String getAllStorage(){
        List<maskstorage> list = hosService.findAllStorage();

        return JSON.toJSONString(list);
    }

    @Operation(summary = "Add a new storage information", description = "", tags = { "storage" })
    @RequestMapping(value = "/newstorage", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public @ResponseBody String addNewStorage(HttpServletRequest request, @RequestBody String requestbody) {
        System.out.println("test");
        System.out.println(requestbody);
        JSONObject object = JSONObject.parseObject(requestbody);
        maskstorage storage = object.toJavaObject(maskstorage.class);

        hosService.saveStorage(storage);

        return "success";
    }

    @Operation(summary = "Get the storage information by hospital id", description = "", tags = { "storage" })
    @RequestMapping(value = "/storage/{hosId}", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public @ResponseBody String getStorageByHosId(HttpServletRequest request, @PathVariable int hosId) {
        System.out.println("test");
        System.out.println(hosId);
        List<maskstorage> storage = hosService.findStorageByHosId(hosId);

        return JSON.toJSONString(storage);
    }
}