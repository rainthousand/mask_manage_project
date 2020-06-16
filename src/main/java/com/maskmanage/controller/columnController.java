package com.maskmanage.controller;

import com.alibaba.fastjson.JSON;
import com.maskmanage.entity.maskcolumn;
import com.maskmanage.service.columnService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/")
public class columnController {

    @Resource(name = "columnServiceImpl")
    private columnService columnService;

    @GetMapping("getColumns")
    public String getAllColumn(){
        List<maskcolumn> list = columnService.getAllColumn();
        return JSON.toJSONString(list);
    }
    @GetMapping("getColumnContent/{id}")
    public String getColumById(@PathVariable("id") int columnid){
        maskcolumn maskcolumn1 = new maskcolumn();
        maskcolumn1 = columnService.getColumnById(columnid);
        return JSON.toJSONString(maskcolumn1);

    }

}
