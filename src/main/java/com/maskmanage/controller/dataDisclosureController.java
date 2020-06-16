package com.maskmanage.controller;

import com.alibaba.fastjson.JSON;
import com.maskmanage.entity.maskdata;
import com.maskmanage.service.datadisclosureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/")
public class dataDisclosureController {
    @Resource(name = "dataDisclosureServiceImpl")
    private datadisclosureService datadisclosureService;

    @GetMapping("getData")
    public String getAllDate(){
        List<maskdata> list = datadisclosureService.getAllMaskdata();
        return JSON.toJSONString(list);
    }
    @GetMapping("getDataContent/{id}")
    public String getDataById(@PathVariable("id") int dataId){
        maskdata maskdata1 = new maskdata();
        maskdata1 = datadisclosureService.getMaskdataByid(dataId);
        return JSON.toJSONString(maskdata1);
    }
}
