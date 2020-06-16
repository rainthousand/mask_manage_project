package com.maskmanage.service.impl;


import com.maskmanage.entity.*;
import com.maskmanage.mapper.*;
import com.maskmanage.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServImpl implements loginService {

    @Autowired
    private maskuserMapper maskuserMapper;

    @Override
    public maskuser loginU(maskuserKey maskuserkey1) {
        maskuser maskuser1 = new maskuser();
        maskuser1 = (maskuser)maskuserMapper.selectByPrimaryKey(maskuserkey1);
        return maskuser1;
    }


    @Autowired
    private donatorMapper donatorMapper;

    @Override
    public donator loginDonatorById(int donatorId) {
        donator donator1 = new donator();
        donator1 = (donator) donatorMapper.selectByPrimaryKey(donatorId);
        return donator1;
    }

    @Autowired
    private hospitalMapper hospitalMapper1;
    @Override
    public hospital loginHospitalById(int hospitalId) {
        hospital hospital1 = new hospital();
        hospital1 = (hospital)hospitalMapper1.selectByPrimaryKey(hospitalId);
        return hospital1;
    }

    @Autowired
    private maskadminMapper maskadminMapper;
    @Override
    public maskadmin loginMaskadmin(int adminId) {
        maskadmin maskadmin1 = new maskadmin();
        maskadmin1 = (maskadmin) maskadminMapper.selectByPrimaryKey(adminId);
        return maskadmin1;
    }

    @Autowired
    private supervisorMapper supervisorMapper;
    @Override
    public supervisor loginSupervisor(int supervisorId) {
        supervisor supervisor1 = new supervisor();
        supervisor1 = (supervisor)supervisorMapper.selectByPrimaryKey(supervisorId);
        return supervisor1;
    }
}
