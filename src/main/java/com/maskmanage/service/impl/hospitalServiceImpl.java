package com.maskmanage.service.impl;

import com.maskmanage.entity.*;
import com.maskmanage.mapper.expressMapper;
import com.maskmanage.mapper.maskstorageMapper;
import com.maskmanage.mapper.maskusageMapper;
import com.maskmanage.mapper.requirementMapper;
import com.maskmanage.service.hospitalService;
import com.maskmanage.service.requirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class hospitalServiceImpl implements hospitalService {
    @Autowired
    private requirementMapper reqMapper;

    @Autowired
    private expressMapper expMapper;

    @Autowired
    private maskusageMapper usageMapper;

    @Autowired
    private maskstorageMapper storageMapper;

    @Override
    public void saveRequirement(requirement reqr) {
        reqMapper.insert(reqr);
    }

    @Override
    public List<requirement> findAllRequirement() {
        requirementExample example = new requirementExample();
        requirementExample.Criteria criteria =example.createCriteria();
        return reqMapper.selectByExample(example);
    }

    @Override
    public List<requirement> findReqByHosId(int hosId) {
        requirementExample example = new requirementExample();
        requirementExample.Criteria criteria =example.createCriteria();
        criteria.andReqrhosidEqualTo(hosId);

        return reqMapper.selectByExample(example);
    }

    @Override
    public List<express> findAllExpress() {
        expressExample example = new expressExample();
        expressExample.Criteria criteria =example.createCriteria();

        return expMapper.selectByExample(example);
    }

    @Override
    public express findExpressByReqId(int reqId) {
        expressExample example = new expressExample();
        expressExample.Criteria criteria =example.createCriteria();
        criteria.andReqridEqualTo(reqId);
        List<express> list = expMapper.selectByExample(example);

        express exp = list.get(0);
        return exp;
    }

    @Override
    public void saveUsage(maskusage usage) {
        usageMapper.insert(usage);
    }

    @Override
    public List<maskusage> findAllUsage() {
        maskusageExample example = new maskusageExample();
        maskusageExample.Criteria criteria =example.createCriteria();

        return usageMapper.selectByExample(example);
    }

    @Override
    public List<maskusage> findUsageByReqId(int reqId) {
        maskusageExample example = new maskusageExample();
        maskusageExample.Criteria criteria =example.createCriteria();
        criteria.andReqridEqualTo(reqId);
        List<maskusage> list = usageMapper.selectByExample(example);

        return list;
    }

    @Override
    public void saveStorage(maskstorage storage) {
        storageMapper.insert(storage);
    }

    @Override
    public List<maskstorage> findAllStorage() {
        maskstorageExample example = new maskstorageExample();
        maskstorageExample.Criteria criteria =example.createCriteria();

        return storageMapper.selectByExample(example);
    }

    @Override
    public List<maskstorage> findStorageByHosId(int hosId) {
        maskstorageExample example = new maskstorageExample();
        maskstorageExample.Criteria criteria =example.createCriteria();
        criteria.andHosidEqualTo(hosId);

        List<maskstorage> list = storageMapper.selectByExample(example);
        return list;
    }
}
