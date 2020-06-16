package com.maskmanage.service.impl;

import com.maskmanage.entity.maskdata;
import com.maskmanage.entity.maskdataExample;
import com.maskmanage.mapper.maskdataMapper;
import com.maskmanage.service.datadisclosureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class dataDisclosureServiceImpl implements datadisclosureService {
    @Autowired
    private maskdataMapper maskdataMapper;

    @Override
    public List<maskdata> getAllMaskdata() {
        maskdataExample maskdataExample = new maskdataExample();
        maskdataExample.Criteria criteria = maskdataExample.createCriteria();

        return maskdataMapper.selectByExample(maskdataExample);
    }

    @Override
    public maskdata getMaskdataByid(int dataId) {

        return maskdataMapper.selectByPrimaryKey(dataId);
    }
}
