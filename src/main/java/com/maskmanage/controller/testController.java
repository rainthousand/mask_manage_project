package com.maskmanage.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.maskmanage.entity.maskusage;
import com.maskmanage.entity.requirement;
import com.maskmanage.service.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.hateoas.MediaTypes;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/")
public class testController {

    @Resource(name = "requirementServiceImpl")
    private requirementService reqService;
    @Resource(name = "supervisionServiceImpl")
    private supervisorService supervisorService;

//    @RequestMapping("home")
//    public @ResponseBody
//    String homePage(){
//        return "This  is home page";
//    }
//    public String indexPage(){
//        return "login";
//    }

//    @Operation(summary = "Find all employees", description = "", tags = { "employee" })
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "successful operation",
//                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = requirement.class)))) })
//
    @GetMapping(value="reqs")
//    @PreAuthorize("hasAuthority('INVENTORY_VIEW')")
    public List<maskusage> getAllRequirements(){
       return supervisorService.getUsage(1,1,0);
    }
}