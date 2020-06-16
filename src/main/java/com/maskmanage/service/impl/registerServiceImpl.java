package com.maskmanage.service.impl;

import com.maskmanage.entity.*;
import com.maskmanage.mapper.*;
import com.maskmanage.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class registerServiceImpl implements registerService {


    @Autowired
    private maskuserMapper maskuserMapper;
    @Override
    public int registerU(maskuser maskuser1) {
        int temp = (int)maskuserMapper.insert(maskuser1);

        return temp;
    }

    @Autowired
    private donatorMapper donatorMapper;
    @Override
    public int registerDonator(donator donator1) {
        int temp = donatorMapper.insert(donator1);

        return temp;
    }

    @Autowired
    private hospitalMapper hospitalMapper;
    @Override
    public int registerHospital(hospital hospital1) {
        int temp = hospitalMapper.insert(hospital1);
        return temp;
    }

    @Autowired
    private maskadminMapper maskadminMapper;
    @Override
    public int registerMaskadmin(maskadmin maskadmin1) {
        int temp = maskadminMapper.insert(maskadmin1);
        return temp;
    }

    @Autowired
    private supervisorMapper supervisorMapper;
    @Override
    public int registerSupervisor(supervisor supervisor1) {
        int temp = supervisorMapper.insert(supervisor1);
        return temp;
    }


}
